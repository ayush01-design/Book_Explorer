package com.bookexplorer.dto;

public class ReviewRequest {

    private String bookId;
    private Integer rating;
    private String review;

    public ReviewRequest() {
    }

    public ReviewRequest(String bookId, Integer rating, String review) {
        this.bookId = bookId;
        this.rating = rating;
        this.review = review;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
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
}
