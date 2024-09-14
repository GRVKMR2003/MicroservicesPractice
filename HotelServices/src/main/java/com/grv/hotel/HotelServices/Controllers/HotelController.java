package com.grv.hotel.HotelServices.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.grv.hotel.HotelServices.Entities.Hotel;
import com.grv.hotel.HotelServices.services.hotelServices;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private hotelServices serv;

    @PostMapping
    public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel){
        Hotel h = serv.add(hotel);
        return new ResponseEntity<>(h, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable String id){
        Hotel h = serv.getbyid(id);
        return new ResponseEntity<>(h, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Hotel> updateHotel(@PathVariable String id, @RequestBody Hotel hotelDetails) {
        Hotel updatedHotel = serv.update(id, hotelDetails);
        return new ResponseEntity<>(updatedHotel, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHotel(@PathVariable String id){
        serv.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels(){
        List<Hotel> hotels = serv.getall();
        return new ResponseEntity<>(hotels, HttpStatus.OK);
    }
}
