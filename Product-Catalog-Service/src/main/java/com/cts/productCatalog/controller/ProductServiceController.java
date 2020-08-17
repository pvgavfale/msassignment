package com.cts.productCatalog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.productCatalog.entity.Product;
import com.cts.productCatalog.entity.Review;
import com.cts.productCatalog.service.ProductService;
import com.cts.productCatalog.service.ReviewService;

@RestController
@RequestMapping(path = "/api")
public class ProductServiceController {
	
	@Autowired
	public ProductService productService;
	
	@Autowired
	private ReviewService reviewService;
	
	@GetMapping(value ="/products")
	public List<Product> getAllProducts(){
		System.out.println("-----Return All Products-----");
		return productService.getAllProducts();
		
	}
	
	@GetMapping(value ="/products/{id}")
	public Product getProductById(@PathVariable("id") Integer id ){
		System.out.println("-----Return All Products-----");
		return productService.getProductById(id);
		
	}
	
	@GetMapping(value ="/products/byName/{name}")
	public List<Product> getProductByName(@PathVariable("name") String name ){
		System.out.println("-----Return All Products-----");
		return productService.getProductsByName(name);
		
	}
	
	@PostMapping(value="/products")
	public Product saveProducts(@RequestBody Product product ) {
		
		
		return productService.saveProduct(product);
		
	}
	
	@PostMapping(value="/products/all")
	public List<Product> saveProducts(@RequestBody List<Product> products ) {
		
		
		return productService.saveProducts(products);
		
	}
	
	@PostMapping(value ="/products/{id}/reviews")
	public Review saveProductReviewById(@PathVariable("id") Integer id, @RequestBody Review review){
		System.out.println("-----Return Review by Id-----"+id);
		
		Product product = productService.getProductById(id);
		System.out.println(product!=null?product.getId():"No record");
		System.out.println("========");
		review.setProduct(product);
		
		reviewService.saveReviewById(review);
		//roduct.
		return reviewService.saveReviewById(review);
		
	}
	
	@GetMapping(value ="/products/{id}/reviews")
	public List<Review> getAllReviewsByProductId(@PathVariable("id") Integer id ){
		System.out.println("-----Return All Products-----");
		return reviewService.getReviewById(id);
		
	}

}
