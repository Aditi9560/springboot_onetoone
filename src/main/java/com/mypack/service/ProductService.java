package com.mypack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypack.model.Product;
import com.mypack.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public Product save(Product product) {
		
		Product saveproduct=repository.save(product);
		return saveproduct;
	}

}
