package com.miu.movieinfoservice.models;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Movie {
	
	
	@Id
	@GeneratedValue
	@Column(name = "movieid")
	private int movieId;
	
	private String name;
	private String description;
	
	@Temporal(TemporalType.DATE)
	private Date releaseDate;
	
	public Movie() {}
	
	public Movie(int movieId, String name, String description, Date releaseDate) {
		this.movieId = movieId;
		this.name = name;
		this.description = description;
		this.releaseDate = releaseDate;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
