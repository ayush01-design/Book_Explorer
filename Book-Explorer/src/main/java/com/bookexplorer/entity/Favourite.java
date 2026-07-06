package com.bookexplorer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "favourites")
public class Favourite {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private Long movieId;

    public Favourite() {
    }

    public Favourite(Long id, Long userId, Long movieId) {
        this.id = id;
        this.userId = userId;
        this.movieId = movieId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
}
