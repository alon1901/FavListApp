package com.example.favlistapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CategoryRecyclerAdapter extends RecyclerView.Adapter<CategoryViewHolder> {

    String[] categories = {"hobbies","sport","games","electronics gadjets","foods","favoriete countrys","hobbies","sport","games","electronics gadjets","foods","favoriete countrys","hobbies","sport","games","electronics gadjets","foods","favoriete countrys"};


    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.category_viewholder,parent,false);
        CategoryViewHolder categoryViewHolder = new CategoryViewHolder(view);
        return categoryViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {

        holder.getTxtCategoryNumber().setText(Integer.toString(position));
        holder.getTxtCategoryName().setText(categories[position]);

    }

    @Override
    public int getItemCount() {
        return categories.length;
    }
}
