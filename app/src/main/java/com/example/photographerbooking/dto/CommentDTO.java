package com.example.photographerbooking.dto;

import java.util.Date;

public class CommentDTO {
    private String photographer;
    private String username;
    private int avatar;
    private int rating;
    private String comment;
    private String date;

    public CommentDTO(String photographer, String username, int avatar, int rating, String comment, String date) {
        this.photographer = photographer;
        this.username = username;
        this.avatar = avatar;
        this.rating = rating;
        this.comment = comment;
        this.date = date;
    }

    public String getPhotographer() {
        return photographer;
    }

    public String getUsername() {
        return username;
    }

    public int getAvatar() {
        return avatar;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public String getDate() {
        return date;
    }
}
