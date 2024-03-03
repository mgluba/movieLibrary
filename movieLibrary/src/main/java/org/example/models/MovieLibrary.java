package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class MovieLibrary {

    private List<Movie> movies ;

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public void fillMovieList(){
        movies = new ArrayList<>();
        Director ridleyScott = new Director("Ridley","Scott");
        Director g_Verbinski = new Director("Gore","Verbinski");
        Director q_Tarantino = new Director("Quentin","Tarantino");
        Director p_Jackson = new Director("Peter","Jackson");

        Actor russelCrow = new Actor("Russel","Crow");
        Actor o_Reed = new Actor("Oliver", "Reed");
        Actor d_Jacob = new Actor("Derek", "Jacob");
        Actor j_Deep = new Actor("Johnny", "Deep");
        Actor o_Bloom = new Actor("Orlando", "Bloom");
        Actor k_Knightley = new Actor("Keira", "Knightley");
        Actor j_Travolta = new Actor("John", "Travolta");
        Actor u_Thurman = new Actor("Uma", "Thurman");
        Actor h_Keitel = new Actor("Harvey", "Keitel");
        Actor t_Cruze = new Actor("Tom", "Cruise");

        movies.add(new Movie("Gladiator",ridleyScott,List.of(russelCrow,o_Reed,d_Jacob)));
        movies.add(new Movie("Pirates of the Caribbean",g_Verbinski, List.of(o_Reed, j_Deep)));
        movies.add(new Movie("Pulp Fiction",q_Tarantino, List.of(j_Travolta, u_Thurman)));
        movies.add(new Movie("Hobbit - An Unexpected Jorney",ridleyScott, List.of(k_Knightley, d_Jacob)));
        movies.add(new Movie("Poranek Kojota",p_Jackson, List.of(russelCrow, o_Bloom)));
        movies.add(new Movie("Transformers",q_Tarantino, List.of(russelCrow, d_Jacob)));
        movies.add(new Movie("Top Gun",ridleyScott, List.of(russelCrow, t_Cruze)));
        movies.add(new Movie("Desperado",ridleyScott, List.of(russelCrow, o_Bloom)));
        movies.add(new Movie("Mission Impossible",p_Jackson, List.of(russelCrow, t_Cruze)));
        movies.add(new Movie("Forest Gump",g_Verbinski, List.of(o_Reed, h_Keitel)));




    }
}
