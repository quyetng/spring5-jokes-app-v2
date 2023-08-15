package com.example.spring5jokesapp.model;

import com.example.spring5jokesapp.service.JokeService;
import org.springframework.stereotype.Service;

@Service
public class Joke implements JokeService {
    private String joke;

    public Joke() {
    }

    public Joke(String quote) {
        this.joke = quote;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    @Override
    public String findJoke(Joke joke) {
        return null;
    }
}
