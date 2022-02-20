package com.example.photographerbooking.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.photographerbooking.R;
import com.example.photographerbooking.model.Category;
import com.example.photographerbooking.model.Photographer;

import java.util.List;

public class PhotographerItemsAdapter extends RecyclerView.Adapter<PhotographerItemsAdapter.ItemViewHolder>{
    Context context;
    List<Photographer> listPG;

    public PhotographerItemsAdapter(Context context, List<Photographer> listPG) {
        this.context = context;
        this.listPG = listPG;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.photographer_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Photographer photographer = listPG.get(position);
        holder.photographer = photographer;
        holder.contentImg.setImageResource(photographer.getPg_avatar());
        holder.txtName.setText(photographer.getName());
        holder.txtLocation.setText(photographer.getLocation());
        holder.txtRating.setText(String.valueOf(photographer.getRating()));
    }

    @Override
    public int getItemCount() {
        return listPG.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        TextView txtName ;
        TextView txtLocation;
        TextView txtRating;
        ImageView contentImg;
        Photographer photographer;
        CardView cvPG_item;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            cvPG_item = itemView.findViewById(R.id.pg_item);
            txtName = itemView.findViewById(R.id.pg_name);
            contentImg = itemView.findViewById(R.id.pg_avatar);
           txtLocation = itemView.findViewById(R.id.pg_location);
           txtRating =itemView.findViewById(R.id.pg_rating);


        }
    }
}
