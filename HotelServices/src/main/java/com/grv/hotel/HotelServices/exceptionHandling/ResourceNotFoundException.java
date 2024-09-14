package com.grv.hotel.HotelServices.exceptionHandling;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException() {
        super("This hotel does not exist!");
    }

    public ResourceNotFoundException(String s) {
        super(s);
    }
}
