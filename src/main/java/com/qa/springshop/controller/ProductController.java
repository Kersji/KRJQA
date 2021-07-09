package com.qa.springshop.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springshop.domain.Product;
import com.qa.springshop.service.ProductService;

@RestController
@RequestMapping("/Product")
public class ProductController {

	// Mapping URLs to Methods
	
	private ProductService service;

	@Autowired
	public ProductController(ProductService service) {
		this.service = service;
	}
	
	// CRUD functionality
	
	// CREATE
	@PostMapping("/createProd")
	public ResponseEntity<String> createProd(@RequestBody Product prod) {
		return new ResponseEntity<String> (this.service.createProd(prod), 
				HttpStatus.CREATED);
	} 
	
	// READ
	@GetMapping("/readAllProd")
	public ResponseEntity<List<Product>> readAllProd(){
		return new ResponseEntity<List<Product>> (this.service.readAllProd(), 
				HttpStatus.OK);
	}
	
	// UPDATE
	@PatchMapping("/updateProd/{id}")
	public ResponseEntity<Product> updateProd(
			@PathVariable Long id, 
			@RequestBody Product prod) {
		return new ResponseEntity<Product> (this.service.updateProd(id, prod), 
				HttpStatus.ACCEPTED);
	}
	
	// DELETE
	@DeleteMapping("/deleteProd/{id}")
	public ResponseEntity<Product> deleteProd(@PathVariable Long id){
		this.service.deleteProd(id);
		return new ResponseEntity<Product> (HttpStatus.NO_CONTENT);
	}
		
}
