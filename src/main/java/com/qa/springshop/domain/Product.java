package com.qa.springshop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Marking the Class as a Table
public class Product {

	@Id // Define the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment

	// Variables
	private Long id;				// Product Id
	private String prodDesc; 		// Product description
	private Double costPrice;		// Cost price
	private Double retailPrice; 	// Retail price
	private Boolean onPromo; 		// On promotion?
	private Double promoPrice; 		// Promotional price
	private String promoDate; 		// Activation date

	// Default Constructor
	public Product() {};

	// Constructor with all fields excluding Id
	public Product(String prodDesc, Double costPrice, Double retailPrice, 
			Boolean onPromo, Double promoPrice,	String promoDate) {
		this.prodDesc = prodDesc;
		this.costPrice = costPrice;
		this.retailPrice = retailPrice;
		this.onPromo = onPromo;
		this.promoPrice = promoPrice;
		this.promoDate = promoDate;
	}

	// Constructor with all fields
	public Product(Long id, String prodDesc, Double costPrice, Double retailPrice, 
			Boolean onPromo, Double promoPrice,	String promoDate) {
		this.id = id;
		this.prodDesc = prodDesc;
		this.costPrice = costPrice;
		this.retailPrice = retailPrice;
		this.onPromo = onPromo;
		this.promoPrice = promoPrice;
		this.promoDate = promoDate;
	}

	// Getters
	public String getProdDesc() {
		return prodDesc;
	}

	public Double getCostPrice() {
		return costPrice;
	}

	public Double getRetailPrice() {
		return retailPrice;
	}

	public Boolean getOnPromo() {
		return onPromo;
	}

	public Double getPromoPrice() {
		return promoPrice;
	}

	public String getPromoDate() {
		return promoDate;
	}

	// Setters
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public void setOnPromo(Boolean onPromo) {
		this.onPromo = onPromo;
	}

	public void setPromoPrice(Double promoPrice) {
		this.promoPrice = promoPrice;
	}

	public void setPromoDate(String promoDate) {
		this.promoDate = promoDate;
	}

}
