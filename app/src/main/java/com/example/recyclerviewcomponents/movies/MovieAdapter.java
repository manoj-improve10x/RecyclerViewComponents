package com.example.recyclerviewcomponents.movies;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcomponents.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {

    public ArrayList<Movie> movies;
    public void setData(ArrayList<Movie> movieNamesList) {
        movies = movieNamesList;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movies_item_xml,parent,false);
        MovieViewHolder movieViewHolder = new MovieViewHolder(view);
        return movieViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {

        Movie movieName = movies.get(position);
        holder.moviesNameTxt.setText(movieName.title);
        Picasso.get().load(movieName.imageUrl).into(holder.moviesImg);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
