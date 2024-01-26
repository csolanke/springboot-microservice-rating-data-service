package com.learnwithchandrakant.ratingsdataservice.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingdata")
public class RatingResource {


    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating("TNS","5");
    }

    @GetMapping("/users/{userId}")
    public UserRating getUsersRating(@PathVariable("userId") String userId){
      List<Rating>  ratings =Arrays.asList(
                new Rating("100","3"),
                new Rating("101","4"),
                new Rating("102","5")
        );

      UserRating userRating= new UserRating();
      userRating.setUserRating(ratings);

      return userRating;
    }
}
