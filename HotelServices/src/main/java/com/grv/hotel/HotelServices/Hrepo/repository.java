package com.grv.hotel.HotelServices.Hrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grv.hotel.HotelServices.Entities.Hotel;

public interface repository extends JpaRepository<Hotel,String> {
    
}
