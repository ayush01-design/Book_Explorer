package com.bookexplorer.service.serviceImplementation;

import com.bookexplorer.dto.ReviewRequest;
import com.bookexplorer.dto.ReviewResponse;
import com.bookexplorer.service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImp  implements ReviewService {

    @Override
    public ReviewResponse addReview(Long userId, Long bookId, ReviewRequest request) {
        return null;
    }

    @Override
    public List<ReviewResponse> getReviewsByBook(Long bookId) {
        return List.of();
    }

    @Override
    public ReviewResponse updateReview(Long reviewId, ReviewRequest request) {
        return null;
    }

    @Override
    public void deleteReview(Long reviewId) {

    }
}
