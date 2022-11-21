package com.example.recyclerviewcomponents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AdvancedSeriesActivity extends AppCompatActivity {

    public ArrayList<SeriesName> seriesNames;
    public AdvancedSeriesAdapter advancedSeriesAdapter;
    public RecyclerView advancedSeriesRv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_series);
        getSupportActionBar().setTitle("Advanced Series");
        setupData();
        setupAdvancedSeriesRv();
    }

    public void setupData() {
        seriesNames = new ArrayList<>();

        SeriesName seriesName1 = new SeriesName();
        seriesName1.seriesId = 1;
        seriesName1.titleName = "Kung Fu Panda Movie Series";
        seriesName1.imageUrl = "https://occ-0-1556-1007.1.nflxso.net/dnm/api/v6/E8vDc_W8CLv7-yMQu8KMEC7Rrr8/AAAABduFRBhx6t-Dhqq_nz4teWtFQs7rpEnkYggmaKnJ1jjtbaGGqVSTZi1OfHu6DkmLzO7d5bXlhKYE1Eu6jrJoaO64l0uKJY2YEHJb.jpg?r=109";
        seriesNames.add(seriesName1);

    }

    public void setupAdvancedSeriesRv() {
        advancedSeriesRv = findViewById(R.id.advanced_series_rv);
        advancedSeriesRv.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL , false));
        advancedSeriesAdapter = new AdvancedSeriesAdapter();
        advancedSeriesAdapter.setData(seriesNames);
        advancedSeriesRv.setAdapter(advancedSeriesAdapter);
    }
}