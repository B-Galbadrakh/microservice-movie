package com.miu.ratingdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miu.ratingdataservice.models.Rating;
import com.miu.ratingdataservice.models.UserRating;

@RestController
@RequestMapping("/rating")
public class RatingDataService {
	
	
	@RequestMapping("/{movieId}")
	public Rating getMovieRating(@PathVariable("movieId") String movieId) {
		
		return new Rating("foo", 4);
		
	}
	
	@RequestMapping("/users/{userId}")
	public UserRating getRatingsOfUser(@PathVariable("userId") String userId){
		
		List<Rating> ratings = Arrays.asList(
				new Rating("1", 5),
				new Rating("2", 3));
		
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		return userRating;
		
	}
	
	

}
