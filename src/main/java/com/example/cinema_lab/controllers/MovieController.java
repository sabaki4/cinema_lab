package com.example.cinema_lab.controllers;

import com.example.cinema_lab.models.Movie;
import com.example.cinema_lab.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping
    public ResponseEntity<String> newMovie(@RequestBody Movie movie){
        String reply = movieService.addNewMovie(movie);
        return new ResponseEntity<>(reply, HttpStatus.CREATED);
    }


    }
