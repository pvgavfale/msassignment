package com.cts.productCatalog.service;

import java.util.List;
import java.util.Optional;

import com.cts.productCatalog.entity.Product;


public interface ProductService {

	public List<Product> getAllProducts();

	public List<Product> getProductsByName(String name);

	public Product getProductById(Integer id);

	public List<Product> saveProducts(List<Product> products);
	
	public Product saveProduct(Product products);

}
