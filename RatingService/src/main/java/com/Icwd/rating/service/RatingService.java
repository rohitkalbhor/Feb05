package com.Icwd.rating.service;

import com.Icwd.rating.entity.Rating;

import java.util.List;

public interface RatingService {


    //create
    Rating create(Rating rating);

    //get all rating
    List<Rating> getRating();

    //get all by userId
    List<Rating> getRatingByUserId(String userId);
    //get all by hotel
    List<Rating>getRatingByHotelId(String hotelId);
}
