package com.grv.hotel.HotelServices.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.grv.hotel.HotelServices.Entities.Hotel;
import com.grv.hotel.HotelServices.Hrepo.repository;
import com.grv.hotel.HotelServices.exceptionHandling.ResourceNotFoundException;

@SuppressWarnings("unused")
@Service
public class hotelServices {
    @Autowired
    private repository repo;


    public Hotel add( Hotel hotel){
        hotel.setHid(UUID.randomUUID().toString());

        return repo.save(hotel);
        
    }


    public void delete(String id) {
        Hotel h = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel with ID " + id + " does not exist!"));
        repo.delete(h);
    }
    

    public Hotel update(String id, Hotel hotelDetails) {
        Hotel existingHotel = repo.findById(id).orElseThrow(() -> 
            new ResourceNotFoundException("Hotel with ID " + id + " does not exist!"));

        existingHotel.setName(hotelDetails.getName());
        existingHotel.setLocation(hotelDetails.getLocation());
        existingHotel.setAbout(hotelDetails.getAbout());

        return repo.save(existingHotel);
    }

    public List<Hotel> getall(){
        return repo.findAll();
    }

    public Hotel getbyid(String id){
        Hotel h = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("hotel of this is not exist!!"));
        return h;
    }
    
}
