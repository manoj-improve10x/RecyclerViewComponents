package com.example.recyclerviewcomponents.template;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcomponents.R;

import java.util.ArrayList;

public class TemplateAdapter extends RecyclerView.Adapter<TemplateViewHolder> {

    public ArrayList<Template> messages;

    public void setData(ArrayList<Template> templateList){
        messages = templateList;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public TemplateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_item_xml,parent,false);
        TemplateViewHolder templateViewHolder = new TemplateViewHolder(view);
        return templateViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TemplateViewHolder holder, int position) {

        Template template = messages.get(position);
        holder.msgTxt.setText(template.messageText);

    }

    @Override
    public int getItemCount() {
        return messages.size();
    }
}
