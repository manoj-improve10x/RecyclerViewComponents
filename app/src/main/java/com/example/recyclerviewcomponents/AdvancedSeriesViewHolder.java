package com.example.recyclerviewcomponents;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdvancedSeriesViewHolder extends RecyclerView.ViewHolder {

    TextView advancedSeriesNameTxt;
    ImageView advancedSeriesImg;

    public AdvancedSeriesViewHolder(@NonNull View itemView) {
        super(itemView);

        advancedSeriesNameTxt = itemView.findViewById(R.id.advanced_series_name_txt);
        advancedSeriesImg = itemView.findViewById(R.id.advanced_series_img);
    }
}
