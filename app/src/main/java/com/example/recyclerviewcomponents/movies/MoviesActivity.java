package com.example.recyclerviewcomponents.movies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewcomponents.R;

import java.util.ArrayList;

public class MoviesActivity extends AppCompatActivity {

    public ArrayList<Movie> movies;
    public RecyclerView moviesRv;
    public MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        getSupportActionBar().setTitle("Movies");
        setupData();
        setupMoviesLv();

    }

    public void setupData() {
        movies = new ArrayList<>();

        Movie movie1 = new Movie();
        movie1.seriesId = 1;
        movie1.movieId = 2;
        movie1.title = "Harry potter and the Sorcerer's Stone";
        movie1.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/f/f3/Harry_Potter_and_the_Philosopher%27s_Stone_%28film%29%28Movieposter%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004220";
        movies.add(movie1);

        Movie movie2 = new Movie();
        movie2.seriesId = 2;
        movie2.movieId = 2;
        movie2.title = "Harry potter and the Chamber's Stone";
        movie2.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/1/1c/Harry_Potter_and_the_Chamber_of_Secrets_%28film%29%28Movie_Poster%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004647";
        movies.add(movie2);

        Movie movie3 = new Movie();
        movie3.seriesId = 3;
        movie3.movieId = 2;
        movie3.title = "Harry potter and the Chamber's Stone";
        movie3.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/1/1c/Harry_Potter_and_the_Chamber_of_Secrets_%28film%29%28Movie_Poster%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004647";
        movies.add(movie3);

        Movie movie4 = new Movie();
        movie4.seriesId = 4;
        movie4.movieId = 2;
        movie4.title = "Harry potter and the Goblet of Fire";
        movie4.imageUrl = "https://img2.sfilm.hu/original/7VRkmVB23rloRbZHsCRPscXlgQp.jpg";
        movies.add(movie4);

        Movie movie5 = new Movie();
        movie5.seriesId = 5;
        movie5.movieId = 2;
        movie5.title = "Harry potter and the Goblet of Fire";
        movie5.imageUrl = "https://img2.sfilm.hu/original/7VRkmVB23rloRbZHsCRPscXlgQp.jpg";
        movies.add(movie5);

        Movie movie6 = new Movie();
        movie6.seriesId = 6;
        movie6.movieId = 2;
        movie6.title = "Harry potter and the Goblet of Fire";
        movie6.imageUrl = "https://img2.sfilm.hu/original/7VRkmVB23rloRbZHsCRPscXlgQp.jpg";
        movies.add(movie6);
    }
    public void setupMoviesLv() {
        moviesRv = findViewById(R.id.movie_rv);
        moviesRv.setLayoutManager(new LinearLayoutManager(this));
        movieAdapter = new MovieAdapter();
        movieAdapter.setData(movies);
        moviesRv.setAdapter(movieAdapter);
    }
}