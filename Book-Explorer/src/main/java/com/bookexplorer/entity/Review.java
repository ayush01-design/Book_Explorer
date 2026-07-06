package com.bookexplorer.entity;

import jakarta.persistence.*;

@Entity
@Table(name="reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long movieId;

    private Long userId;

    @Column(nullable = false)
    private Integer rating;

    private String comment;

    public Review() {
    }

    public Review(Long id, Long movieId, Long userId, Integer rating, String comment) {
        this.id = id;
        this.movieId = movieId;
        this.userId = userId;
        this.rating = rating;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
