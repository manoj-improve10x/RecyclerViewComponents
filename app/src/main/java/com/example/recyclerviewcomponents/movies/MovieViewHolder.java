package com.example.recyclerviewcomponents.movies;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcomponents.R;

public class MovieViewHolder extends RecyclerView.ViewHolder {

    ImageView moviesImg;
    TextView moviesNameTxt;

    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);

        moviesImg = itemView.findViewById(R.id.movies_img);
        moviesNameTxt = itemView.findViewById(R.id.movie_name_txt);
    }
}
