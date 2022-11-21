package com.example.recyclerviewcomponents.series;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcomponents.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SeriesAdapter extends RecyclerView.Adapter<SeriesViewHolder> {

    public ArrayList<Series> series;

    public void setData(ArrayList<Series> seriesList) {
        series = seriesList;
        notifyDataSetChanged();

    }
    @NonNull
    @Override
    public SeriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.series_item_xml,parent,false);
        SeriesViewHolder seriesViewHolder = new SeriesViewHolder(view);
        return seriesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SeriesViewHolder holder, int position) {

        Series series = this.series.get(position);
        holder.seriesNameTxt.setText(series.title);
        Picasso.get().load(series.imageUrl).into(holder.seriesImg);
    }

    @Override
    public int getItemCount() {
        return series.size();
    }
}
