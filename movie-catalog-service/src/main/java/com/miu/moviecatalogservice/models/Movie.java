package com.miu.moviecatalogservice.models;

import java.util.Date;

public class Movie {
	
	private String movieId;
	private String name;
	private String description;
	private Date releaseDate;
	
	
	
	public Movie() {}
	
	public Movie(String movieId, String name) {
		this.movieId = movieId;
		this.name = name;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	

}
