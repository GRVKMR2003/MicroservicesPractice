package com.grv.Ratings.ratingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grv.Ratings.ratingservice.entities.rating;
import com.grv.Ratings.ratingservice.servies.ratingserv;

@RestController
@RequestMapping("/ratings")
public class rcontroller {
    @Autowired
    private ratingserv service;
    @PostMapping
    public ResponseEntity<rating> create(@RequestBody rating r){
        rating rr = service.add(r);
        return new ResponseEntity<>(rr , HttpStatus.CREATED);
    }


    @GetMapping("/")
    public ResponseEntity<List<rating>> getall(){
        List<rating> list = service.getall();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

        @GetMapping("/users/{userid}")
        public ResponseEntity<List<rating>> getbyuserid(@PathVariable String userid){
            List<rating> list = service.findbyuserid(userid);
            return new ResponseEntity<>(list,  HttpStatus.OK);

        }

        @GetMapping("/hotels/{hid}")
        public ResponseEntity<List<rating>> getbyhotelid(@PathVariable String hid){
            List<rating> list = service.findbyuserid(hid);
            return new ResponseEntity<>(list,  HttpStatus.OK);

        }

    
    
}
