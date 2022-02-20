package com.example.photographerbooking.model;

import com.example.photographerbooking.R;

public class Category {
    int id;
    private String label;
    private int color ;
    private int image;
    private int small_img;

    public Category(int id, String label, int small_img) {
        this.id = id;
        this.label = label;
        this.small_img = small_img;
    }

    public int getSmall_img() {
        return small_img;
    }

    public void setSmall_img(int small_img) {
        this.small_img = small_img;
    }

    public Category(int id, String label, int color, int image) {
        this.id = id;
        this.label = label;
        this.image= image;
        if(color ==  1){
            this.color = R.drawable.ic_wave_red;
        }else if(color== 2){
            this.color = R.drawable.ic_wave_blue;
        }else if (color == 3){
            this.color = R.drawable.ic_wave_yellow;
        }


    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
