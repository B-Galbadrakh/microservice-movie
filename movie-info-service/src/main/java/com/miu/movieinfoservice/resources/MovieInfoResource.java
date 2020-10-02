package com.miu.movieinfoservice.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miu.movieinfoservice.dto.MovieCollectionDTO;
import com.miu.movieinfoservice.models.Movie;
import com.miu.movieinfoservice.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {
	
	
	@Autowired
	MovieService movieService;
	
	
	@GetMapping
	public MovieCollectionDTO allMovies() {
		
		List<Movie> movies = movieService.getAllMovies();
		MovieCollectionDTO result = new MovieCollectionDTO();
		result.setMovies(movies);
		
		return result;
	}
	
	@GetMapping("/{movieId}")
	public Movie getOneMovie(@PathVariable("movieId") String movieId) {
		Integer mId = Integer.parseInt(movieId);
		Movie m = movieService.getMovie(mId);
		return m;
	}
	
	
	
		

}
