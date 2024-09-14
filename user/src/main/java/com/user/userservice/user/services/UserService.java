package com.user.userservice.user.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.user.userservice.user.entities.Hotel;
import com.user.userservice.user.entities.Rating;
import com.user.userservice.user.entities.User;
import com.user.userservice.user.exceptionhandling.ResourceNotFoundException;
import com.user.userservice.user.feignservice.HotelServices;
import com.user.userservice.user.repositories.userRepo;



@Service
public class  UserService {
     @Autowired
    private userRepo repo;
     @Autowired
    private  HotelServices serv;
     @Autowired
    private RestTemplate restTemp;


        private Logger logger = LoggerFactory.getLogger(UserService.class);

  
    public User create(User user){
        String randomid = UUID.randomUUID().toString();
        user.setId(randomid);
        
        return repo.save(user);

    }


    public List<User> get(){
        return repo.findAll();

    }


   


    public User findbyid(String id) {
        User user = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not exist of id " + id));
    
        Rating[] ratingsOfUser = restTemp.getForObject("http://ratingservice/ratings/users/" + user.getId(), Rating[].class);
        logger.info("{} ", ratingsOfUser);
    
        List<Rating> ratings = new ArrayList<>(Arrays.asList(ratingsOfUser));

        List<Rating> ratingList = new ArrayList<>();
        for (int i = 0; i < ratings.size(); i++) {
            Rating rating = ratings.get(i);
    
            Hotel hotel = HotelServices.getHotel(rating.getHotelId());
            rating.setHotel(hotel); 
            ratingList.add(rating); 
        }
    
        user.setRating(ratingList);
    
        return user;
    }
    

    
}
