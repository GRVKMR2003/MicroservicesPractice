package com.grv.Ratings.ratingservice.servies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import com.grv.Ratings.ratingservice.entities.rating;
import com.grv.Ratings.ratingservice.repository.repository;
import java.util.UUID;


@Service
public class ratingserv {

    @Autowired
    private repository repo;



    public rating add(rating r){
    String s =  UUID.randomUUID().toString();
    r.setId(s);
    return  repo.save(r);
    }

    public List<rating> getall(){
        return repo.findAll();
    }

    public List<rating> findbyuserid(String id){
        return repo.findByUserid(id);

    }
    public List<rating> findbyhotelid(String id){
        return repo.findByHotelid(id);

    }

    
    
}
