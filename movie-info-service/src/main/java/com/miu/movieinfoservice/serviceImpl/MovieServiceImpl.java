package com.miu.movieinfoservice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miu.movieinfoservice.models.Movie;
import com.miu.movieinfoservice.repository.MovieRepository;
import com.miu.movieinfoservice.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	MovieRepository movieRepository;

	@Override
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	@Override
	public Movie getMovie(int movieId) {
		
		Movie movie = movieRepository.findById(movieId).orElse(null);
		return movie;
	}

	@Override
	public Movie addMovie(Movie movie) {
		
		Movie m = movieRepository.save(movie);
		return m;
	}
	
	

}
