package com.imdb.imdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imdb.imdb.entity.Movies;

public interface MoviesRepository extends JpaRepository<Movies,Integer> {

}
