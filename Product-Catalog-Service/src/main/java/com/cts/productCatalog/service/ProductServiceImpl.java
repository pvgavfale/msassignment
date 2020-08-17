package com.cts.productCatalog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.productCatalog.dao.ProductDao;
import com.cts.productCatalog.entity.Product;

@Service
public class ProductServiceImpl  implements ProductService{
	
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

	@Override
	public List<Product> getProductsByName(String name) {
		
		return productDao.findByNameContaining(name);
	}

	@Override
	public Product getProductById(Integer id) {
		// TODO Auto-generated method stub
		return productDao.findProductById(id);
	}

	@Override
	public List<Product> saveProducts(List<Product> products) {
		return productDao.saveAll(products);

	}

	@Override
	public Product saveProduct(Product products) {
		return productDao.save(products);
		
	}

}
