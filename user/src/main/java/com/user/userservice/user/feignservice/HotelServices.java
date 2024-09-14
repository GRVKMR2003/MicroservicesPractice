package com.user.userservice.user.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

import com.user.userservice.user.entities.Hotel;

@FeignClient(name = "HOTELSERVICES")
public interface HotelServices {

    @GetExchange("/hotels/{id}")
    static
    Hotel getHotel(@PathVariable String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHotel'");
    }
    
}
