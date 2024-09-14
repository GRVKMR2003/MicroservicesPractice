package com.grv.hotel.HotelServices.exceptionHandling;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalexceptionHandler {

    @SuppressWarnings("unchecked")
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String , Object>> notFoundHandler(ResourceNotFoundException ex){
        Map mp = new HashMap<>();
        mp.put("message",ex.getMessage());
        mp.put("success", false);
        mp.put("status", HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(mp,HttpStatus.NOT_FOUND);

        
    }

    
}
