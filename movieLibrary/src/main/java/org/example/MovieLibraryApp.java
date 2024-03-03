package org.example;

import org.example.models.MovieLibrary;

public class MovieLibraryApp {
    public static void main(String[] args) {

        MovieLibrary movieLibrary = new MovieLibrary();
        movieLibrary.fillMovieList();

    }
}