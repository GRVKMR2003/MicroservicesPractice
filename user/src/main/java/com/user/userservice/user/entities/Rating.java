package com.user.userservice.user.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
    private String userId;
    private String hotelId;
    private  int rating;
    private  String feedback;
    private Hotel hotel;
    private String ratingId;
    
  
   


}
