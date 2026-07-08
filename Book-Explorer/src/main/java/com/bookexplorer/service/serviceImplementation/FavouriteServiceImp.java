package com.bookexplorer.service.serviceImplementation;

import com.bookexplorer.dto.BookResponse;
import com.bookexplorer.service.FavouriteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavouriteServiceImp implements FavouriteService {
    @Override
    public void addFavourite(Long userId, Long bookId) {

    }

    @Override
    public void removeFavourite(Long userId, Long bookId) {

    }

    @Override
    public List<BookResponse> getFavouriteBooks(Long userId) {
        return List.of();
    }
}
