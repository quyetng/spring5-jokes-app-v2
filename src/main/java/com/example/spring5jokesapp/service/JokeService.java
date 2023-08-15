package com.example.spring5jokesapp.service;

import com.example.spring5jokesapp.model.Joke;
import org.springframework.stereotype.Service;


public interface JokeService {
    String findJoke(Joke joke);
}
