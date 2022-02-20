package com.example.photographerbooking.home;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.photographerbooking.R;
import com.example.photographerbooking.adapter.CommentAdapter;
import com.example.photographerbooking.dto.CommentDTO;

import java.util.ArrayList;

public class PhotographerDetailsActivity extends AppCompatActivity {
    RecyclerView comment_recycler_view;
    CommentAdapter comment_adapter;
    ArrayList<CommentDTO> comment_array = new ArrayList<>();
    ViewFlipper view_flipper;
    ImageButton btn_next, btn_previous;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photographer_details);

//        setCommentData();
        binding();
//        setUpRecyclerView();
        setFunctionForButton();
    }

    private void binding() {
//        comment_recycler_view = findViewById(R.id.comment_recycler_view);
        view_flipper = findViewById(R.id.view_flipper);
        btn_next = findViewById(R.id.btn_next);
        btn_previous = findViewById(R.id.btn_previous);
    }

    private void setUpRecyclerView() {
        comment_adapter = new CommentAdapter(comment_array);
        comment_recycler_view.setAdapter(comment_adapter);
        comment_recycler_view.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setFunctionForButton() {
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view_flipper.setInAnimation(PhotographerDetailsActivity.this, R.anim.flip_in_foreward);
                view_flipper.setOutAnimation(PhotographerDetailsActivity.this, R.anim.flip_out_foreward);
                view_flipper.showNext();
            }
        });

        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view_flipper.setInAnimation(PhotographerDetailsActivity.this, R.anim.flip_in_backward);
                view_flipper.setOutAnimation(PhotographerDetailsActivity.this, R.anim.flip_out_backward);
                view_flipper.showPrevious();
            }
        });
    }

    private void setCommentData() {
        comment_array.add(new CommentDTO("Lloyd", "Lucires", R.drawable.img, 5, "first comment", "29/09/2021"));
        comment_array.add(new CommentDTO("Zhou", "Shen Shen", R.drawable.img, 3, "Zhou Shen, love you", "18/09/2021"));
        comment_array.add(new CommentDTO("Shen", "Charlie", R.drawable.img, 1, "third comment", "31/07/2021"));
    }
}
