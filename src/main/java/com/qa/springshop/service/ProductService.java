package com.qa.springshop.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.springshop.domain.Product;
import com.qa.springshop.repo.ProductRepo;

@Service
public class ProductService {

	//Dependency
	public ProductRepo repo;
	
	@Autowired
	public ProductService(ProductRepo repo) {
		this.repo = repo;
	}
		
	// CRUD functionality
	
	// CREATE
	public String createProd(Product prod) {
		this.repo.saveAndFlush(prod);
		return "Product created";
	}
	
	// READ
	public List<Product> readAllProd(){
		return this.repo.findAll();
	}
		
	// UPDATE
	public Product updateProd(Long id, Product prod) {
		
		Product curProd = this.repo.getById(id);
		Product updProd;
		
		curProd.setProdDesc(prod.getProdDesc());
		curProd.setCostPrice(prod.getCostPrice());
		curProd.setRetailPrice(prod.getRetailPrice());
		curProd.setOnPromo(prod.getOnPromo());
		curProd.setPromoPrice(prod.getPromoPrice());
		curProd.setPromoDate(prod.getPromoDate());
		
		// Save changes to the DB
		updProd = this.repo.save(curProd);
		return updProd;		
	}
	
	// DELETE
	public void deleteProd(Long id) {
		this.repo.deleteById(id);
	}
		
}
