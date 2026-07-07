package com.bookexplorer.dto;

import java.util.List;

public class BookResponse {

    private String id;
    private String title;
    private String subtitle;
    private String description;
    private Integer publishYear;
    private String isbn;
    private String coverImage;
    private List<AuthorResponse> authors;
    private List<String> subjects;
    private Float averageRating;
    private Integer reviewCount;
    private Boolean isFavourite;

    public BookResponse() {
    }

    public BookResponse(String id, String title, String subtitle, String description, Integer publishYear, String isbn, String coverImage, List<AuthorResponse> authors, Float averageRating, List<String> subjects, Integer reviewCount, Boolean isFavourite) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.publishYear = publishYear;
        this.isbn = isbn;
        this.coverImage = coverImage;
        this.authors = authors;
        this.averageRating = averageRating;
        this.subjects = subjects;
        this.reviewCount = reviewCount;
        this.isFavourite = isFavourite;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public List<AuthorResponse> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorResponse> authors) {
        this.authors = authors;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Float averageRating) {
        this.averageRating = averageRating;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public Boolean getFavourite() {
        return isFavourite;
    }

    public void setFavourite(Boolean favourite) {
        isFavourite = favourite;
    }
}
