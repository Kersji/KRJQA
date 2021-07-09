package com.qa.springshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.springshop.domain.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
	
	// JpaRepository - Existing API
	// Product -> Type of the Entity (Table)
	// Long -> Primary key type
	
}
