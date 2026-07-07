package com.bookexplorer.dto;

import java.util.List;

public class BookSearchResponse {

    private Integer totalResults;
    private Integer page;
    private Integer limit;
    private List<BookResponse> books;

    public BookSearchResponse() {
    }

    public BookSearchResponse(Integer totalResults, Integer page, Integer limit, List<BookResponse> books) {
        this.totalResults = totalResults;
        this.page = page;
        this.limit = limit;
        this.books = books;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public List<BookResponse> getBooks() {
        return books;
    }

    public void setBooks(List<BookResponse> books) {
        this.books = books;
    }

}
