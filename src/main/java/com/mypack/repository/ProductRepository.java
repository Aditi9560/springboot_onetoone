package com.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypack.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product save(Product product);

}
