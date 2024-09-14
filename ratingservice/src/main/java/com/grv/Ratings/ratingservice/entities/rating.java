package com.grv.Ratings.ratingservice.entities;

import org.hibernate.annotations.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class rating {
     @Id
    //  @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String userid;
    private String hotelid;
    private String  feedback;
    private int rating;
    
}
