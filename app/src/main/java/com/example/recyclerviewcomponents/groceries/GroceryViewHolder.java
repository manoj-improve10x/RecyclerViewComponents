package com.example.recyclerviewcomponents.groceries;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcomponents.R;

public class GroceryViewHolder extends RecyclerView.ViewHolder {

    ImageView groceryImg;
    TextView groceryNameTxt;

    public GroceryViewHolder(@NonNull View itemView) {
        super(itemView);
        groceryImg = itemView.findViewById(R.id.grocery_img);
        groceryNameTxt = itemView.findViewById(R.id.grocery_name_txt);
    }
}
