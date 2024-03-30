package com.imdb.imdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.imdb.imdb.entity.Movies;
import com.imdb.imdb.service.MoviesService;

import java.util.List;

@RestController
public class MovieController {
 @Autowired
    private MoviesService service;

    @PostMapping("/addMovie")
    public Movies addMovie(@RequestBody Movies movies) {
        return service.addMovie(movies);
    }

    @PostMapping("/addMovies")
    public List<Movies> addMovies(@RequestBody List<Movies> movies) {
        return service.addMovies(movies);
    }

    @GetMapping("/Movies")
    public List<Movies> getMovies() {
        return service.getMovies();
    }

    @GetMapping("/MoviesById/{id}")
    public Movies getMoviesById(@PathVariable int id) {
        return service.getMoviesByid(id);
    }
  
      @PutMapping("/update")
    public Movies updateMovies(@RequestBody Movies Movies) {
        return service.updateMovies(Movies);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteMovies(@PathVariable int id) {
        return service.deletemovies(id);
    }


    
}
