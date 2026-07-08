package com.bookexplorer.service;

import com.bookexplorer.dto.ReviewRequest;
import com.bookexplorer.dto.ReviewResponse;

import java.util.List;

public interface ReviewService {
    ReviewResponse addReview(Long userId,
                             Long bookId,
                             ReviewRequest request);

    List<ReviewResponse> getReviewsByBook(Long bookId);

    ReviewResponse updateReview(Long reviewId,
                                ReviewRequest request);

    void deleteReview(Long reviewId);

}
