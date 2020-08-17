package com.cts.productCatalog.service;

import java.util.List;
import java.util.Optional;

import com.cts.productCatalog.entity.Review;

public interface ReviewService {

	public List<Review> getReviewById(Integer id);
	
	public Review saveReviewById(Review review);
}
