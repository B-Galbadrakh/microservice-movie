package com.miu.moviecatalogservice.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.miu.moviecatalogservice.models.Movie;


@Component
public class MovieCollectionDTO {
	
	private List<Movie> movies;
	
	public MovieCollectionDTO(){}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	

}
