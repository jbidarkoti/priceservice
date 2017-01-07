package com.sapient.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author Jagadish Bidarkoti
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private long productId;
	
	private String productName;
	
	private String productType;
	
	private BigDecimal productPrice;
	
	public Product(){}
	
	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}
	
	@Override
	public String toString() {
		return productName + " [" + productType + "]: $" + productPrice;
	}

}
