package com.example.cinema_lab.services;

import com.example.cinema_lab.models.Movie;
import com.example.cinema_lab.repositories.MovieRepository;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieService movieService;

    @Autowired
    MovieRepository movieRepository;

    public String addNewMovie(Movie movie){
        movieRepository.save(movie);
        return "This movie" + movie.getTitle() + "has been added to the database";
    }


}
