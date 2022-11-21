package com.example.recyclerviewcomponents.template;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcomponents.R;

public class TemplateViewHolder extends RecyclerView.ViewHolder {

    TextView msgTxt;

    public TemplateViewHolder(@NonNull View itemView) {
        super(itemView);

        msgTxt = itemView.findViewById(R.id.msg_txt);
    }
}
