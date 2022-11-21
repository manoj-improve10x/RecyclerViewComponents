package com.example.recyclerviewcomponents;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdvancedSeriesAdapter extends RecyclerView.Adapter<AdvancedSeriesViewHolder> {

    public ArrayList<SeriesName> seriesNames;

    public void setData(ArrayList<SeriesName> seriesList) {
        seriesNames = seriesList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AdvancedSeriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.advanced_series_item, parent, false);
        AdvancedSeriesViewHolder advancedSeriesViewHolder = new AdvancedSeriesViewHolder(view);
        return advancedSeriesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdvancedSeriesViewHolder holder, int position) {

        SeriesName seriesName = seriesNames.get(position);
        holder.advancedSeriesNameTxt.setText(seriesName.titleName);
        Picasso.get().load(seriesName.imageUrl).into(holder.advancedSeriesImg);
    }

    @Override
    public int getItemCount() {
        return seriesNames.size();
    }
}
