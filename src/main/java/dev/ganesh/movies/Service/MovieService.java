package dev.ganesh.movies.Service;

import dev.ganesh.movies.Collection.Movie;
import dev.ganesh.movies.Repositary.MovieRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepositary movieRepositary;

    public List<Movie> allMovies(){
        return movieRepositary.findAll();
    }

    public Optional<Movie> findMovieByImdbId(String imdbId) {
        return movieRepositary.findMovieByImdbId(imdbId);
    }
}
