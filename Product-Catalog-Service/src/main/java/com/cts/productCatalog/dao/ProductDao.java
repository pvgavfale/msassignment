package com.cts.productCatalog.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.productCatalog.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

	 List<Product> findByNameContaining(String name);
	
	 Product findProductById(Integer id);

}
