package com.mypack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypack.model.Product;
import com.mypack.service.ProductService;

@RestController
@RequestMapping("onetoonemapping")
public class ProductController {
	@Autowired
	private ProductService service;
	@PostMapping("/product")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product ){
		
	
   Product save=service.save(product);
	return new ResponseEntity<Product>(save, HttpStatus.OK);
}
}

/*http://localhost:8088/onetoonemapping/product

{
"name":"Apple IPhone",
"price":"999.9",
"detail":{
    "description":"iphone 14 pro",
    "weight":0.1,
    "length":5.5,
     "height":3.3,
     "width":1.1
}
}
*/