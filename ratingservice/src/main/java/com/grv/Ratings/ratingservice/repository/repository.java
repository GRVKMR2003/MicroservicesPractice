package com.grv.Ratings.ratingservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grv.Ratings.ratingservice.entities.rating;

public interface repository  extends JpaRepository<rating,String>{

    //custom finder methods
    //camel letter m implement hota h
    
    List<rating> findByUserid(String userid);
    List<rating> findByHotelid(String hotelid);
    
}
