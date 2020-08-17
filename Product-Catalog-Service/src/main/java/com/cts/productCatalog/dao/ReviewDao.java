package com.cts.productCatalog.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.productCatalog.entity.Review;

public interface ReviewDao extends JpaRepository<Review, Integer>{
	
	@Query("FROM Review g where g.product.id = :id")
	List<Review> findReviewsByProductId(Integer id);

}
