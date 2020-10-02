package com.miu.ratingdataservice.resources;

import java.util.List;

import com.miu.ratingdataservice.models.Rating;

public class UserRating {

	private List<Rating> userRating;
	
	public UserRating() {}

	public List<Rating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}
	
	
	
}
