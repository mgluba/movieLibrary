package org.example;

import org.example.handlers.MenuHandlers;
import org.example.handlers.UserInput;
import org.example.models.MovieLibrary;

import static org.example.handlers.MenuHandlers.print;
import static org.example.handlers.MenuOptions.*;

public class MovieLibraryApp {
    public static void main(String[] args) {

        MovieLibrary movieLibrary = new MovieLibrary();
        movieLibrary.fillMovieList();
        MenuHandlers.print();

        while (true) {
            switch (UserInput.getMenuOptionFromUser()) {
                case DISPLAYINFORMATIONABOUTRANDOMMOVIE:
                    movieLibrary.getRandomMovieInformation();

                    break;
                case DISPLAYALLMOVIESFORACTOR:
                    movieLibrary.getFilmsForActor();
                    break;
                case QUIT:
                    System.out.println("Wychodzenie");
                    System.exit(1);
            }
        }
    }
}