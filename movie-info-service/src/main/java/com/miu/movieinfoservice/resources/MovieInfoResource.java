package com.miu.movieinfoservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miu.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {
	
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInf(@PathVariable("movieId") String movieId) {
		
		return new Movie("111", "Transformers");
		
	}
	
	

}
