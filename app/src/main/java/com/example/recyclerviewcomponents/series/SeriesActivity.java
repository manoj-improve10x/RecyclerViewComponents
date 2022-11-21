package com.example.recyclerviewcomponents.series;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewcomponents.R;

import java.util.ArrayList;

public class SeriesActivity extends AppCompatActivity {

    public ArrayList<Series> series;
    public RecyclerView seriesRv;
    public SeriesAdapter seriesAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);
        getSupportActionBar().setTitle("Series");
        setupData();
        setupMoviesRv();
    }

    public void setupData() {
        series = new ArrayList<>();
        Series movie1 = new Series();
        movie1.seriesId = 1;
        movie1.title = "Kung Fu Panda Movie Series";
        movie1.imageUrl = "https://occ-0-1556-1007.1.nflxso.net/dnm/api/v6/E8vDc_W8CLv7-yMQu8KMEC7Rrr8/AAAABduFRBhx6t-Dhqq_nz4teWtFQs7rpEnkYggmaKnJ1jjtbaGGqVSTZi1OfHu6DkmLzO7d5bXlhKYE1Eu6jrJoaO64l0uKJY2YEHJb.jpg?r=109";
        series.add(movie1);

        Series movie2 = new Series();
        movie2.seriesId = 2;
        movie2.title = "Garry Potter movie series";
        movie2.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/3/36/Harry-potter-films.png/revision/latest/scale-to-width-down/1000?cb=20110722151247";
        series.add(movie2);
    }

    public void setupMoviesRv() {
        seriesRv = findViewById(R.id.movie_rv);
        seriesRv.setLayoutManager(new LinearLayoutManager(this));
        seriesAdapter = new SeriesAdapter();
        seriesAdapter.setData(series);
        seriesRv.setAdapter(seriesAdapter);
    }
}