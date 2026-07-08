package com.bookexplorer.service;

import com.bookexplorer.dto.BookResponse;

import java.util.List;

public interface FavouriteService {
    void addFavourite(Long userId,
                      Long bookId);

    void removeFavourite(Long userId,
                         Long bookId);

    List<BookResponse> getFavouriteBooks(Long userId);

}
