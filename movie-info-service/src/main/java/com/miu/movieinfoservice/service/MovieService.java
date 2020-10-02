package com.miu.movieinfoservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.miu.movieinfoservice.models.Movie;

@Service
public interface MovieService {
	
	public List<Movie> getAllMovies();
	
	public Movie getMovie(int movieId);
	
	public Movie addMovie(Movie movie);

}
