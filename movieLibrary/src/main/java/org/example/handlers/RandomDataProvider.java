package org.example.handlers;

import org.example.models.MovieLibrary;

import java.util.Random;

public class RandomDataProvider {

    private static Random random = new Random();

    public static int getRandomIndex() {
       return random.nextInt(MovieLibrary.getMovies().size());

        //hardkodowanie jest grzechem śmiertelnym w programowaniu! ;)
       // return random.nextInt(10);

    }
}
