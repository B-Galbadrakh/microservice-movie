package com.miu.movieinfoservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miu.movieinfoservice.models.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
