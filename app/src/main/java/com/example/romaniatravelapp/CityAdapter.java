package com.example.romaniatravelapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.ViewHolder>{

    private Context context;
    private int rowId;
    private City [] cities;
    private RecyclerViewInterface recyclerViewInterface;
    private City cities1;

    public CityAdapter(Context context, int rowId, City [] cities, RecyclerViewInterface recyclerViewInterface) {
        this.context = context;
        this.rowId = rowId;
        this.cities = cities;
        this.recyclerViewInterface = recyclerViewInterface;
    }

    @NonNull
    @Override
    public CityAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(this.context).inflate(this.rowId,parent, false);

        return new ViewHolder(v, recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull CityAdapter.ViewHolder holder, int position) {
        // populate holder with data at position
        holder.name.setText(this.cities[position].getCityName());
        String name = this.cities[position].getImage();
        name = name.substring(0, name.indexOf("."));
        int imageId = this.context.getResources().getIdentifier(name, "drawable", this.context.getPackageName());
        holder.image.setImageResource(imageId);

    }

    @Override
    public int getItemCount() {
        return this.cities.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView name;
        public ImageView image;

        public ViewHolder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);
            name = itemView.findViewById(R.id.cityName);
            image = itemView.findViewById(R.id.cityImage);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // call the interface method
                    if (recyclerViewInterface != null){
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            recyclerViewInterface.onClickItem(position);
                        }
                    }
                }
            });

        }
    }
}

