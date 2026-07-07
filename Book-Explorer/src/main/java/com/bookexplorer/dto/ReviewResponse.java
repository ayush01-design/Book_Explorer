package com.bookexplorer.dto;

public class ReviewResponse {

    private Long id;
    private Integer rating ;
    private String review;
    private String userName;

    public ReviewResponse() {
    }

    public ReviewResponse(Long id, Integer rating, String review, String userName) {
        this.id = id;
        this.rating = rating;
        this.review = review;
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
