package com.example.photographerbooking.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.photographerbooking.R;
import com.example.photographerbooking.dto.CommentDTO;

import java.util.ArrayList;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.CommentViewHolder>{
    private ArrayList<CommentDTO> commentList;

    public CommentAdapter(ArrayList<CommentDTO> commentList) {
        this.commentList = commentList;
    }

    @NonNull
    @Override
    public CommentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        //Inflate the custom layout
        View view = layoutInflater.inflate(R.layout.review_row, parent, false);

        //Return a new holder instance
        CommentViewHolder viewHolder = new CommentViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CommentViewHolder holder, int position) {
        CommentDTO comment = commentList.get(position);

        holder.tvUsername.setText(comment.getUsername());
        holder.avatar.setImageResource(comment.getAvatar());
        holder.tvDate.setText(comment.getDate());
        holder.ratingBar.setRating(comment.getRating());
        holder.tvComment.setText(comment.getComment());
    }

    @Override
    public int getItemCount() {
        return commentList.size();
    }

    public class CommentViewHolder extends RecyclerView.ViewHolder{
        TextView tvUsername;
        ImageView avatar;
        TextView tvDate;
        RatingBar ratingBar;
        TextView tvComment;

        public CommentViewHolder(@NonNull View itemView) {
            super(itemView);

//            tvUsername = itemView.findViewById(R.id.tv_username);
//            avatar = itemView.findViewById(R.id.iv_avatar);
//            tvDate = itemView.findViewById(R.id.tv_date);
//            ratingBar = itemView.findViewById(R.id.rb_rating);
//            tvComment = itemView.findViewById(R.id.tv_comment);
        }
    }
}
