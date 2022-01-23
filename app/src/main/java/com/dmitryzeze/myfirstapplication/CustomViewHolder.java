package com.dmitryzeze.myfirstapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    private final View itemView;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        this.itemView = itemView;
    }

    public void bind(String text) {
        TextView textView = itemView.findViewById(R.id.item_text_view);
        textView.setText(text);
    }
}
