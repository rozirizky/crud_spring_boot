package com.imdb.imdb.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imdb.imdb.entity.Movies;
import com.imdb.imdb.repository.MoviesRepository;
import java.util.List;
@Service
public class MoviesService {
    @Autowired

    private MoviesRepository repository;

    public Movies addMovie(Movies movie){
      return  repository.save(movie);
    }
    public List<Movies> addMovies(List<Movies> movies){
        return  repository.saveAll(movies);
      }
    
      public List<Movies> getMovies(){
        return repository.findAll();
      }

      public Movies getMoviesByid(int id){
        return repository.findById(id).orElse(null);
      } 
      
      public String deletemovies(int id) {
        repository.deleteById(id);
        return "id " + id + "berhasil dihapus";
    }
    public Movies updateMovies(Movies Movies) {
      Movies MoviesById = repository.findById(Movies.getId()).orElse(null);
      MoviesById.setTitle(Movies.getTitle());
      MoviesById.setRating(Movies.getRating());
      MoviesById.setYear(Movies.getYear());
      MoviesById.setSynopsis(Movies.getSynopsis());
      MoviesById.setRuntime(Movies.getRuntime());
      MoviesById.setDirectors(Movies.getDirectors());
      MoviesById.setFilming_location(Movies.getFilming_location());
      MoviesById.setBudget(Movies.getBudget());
      MoviesById.setIncome(Movies.getIncome());
      MoviesById.setCountry_of_origin(Movies.getCountry_of_origin());
      MoviesById.setGenres(Movies.getGenres());
      
      return repository.save(MoviesById);
  }

      

}
