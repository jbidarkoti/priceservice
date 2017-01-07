package com.sapient.product.client;

import java.util.List;

import com.sapient.entity.Product;

/**
 * 
 * @author Jagadish Bidarkoti
 *
 */

public interface ProductServiceClient {
	
	List<Product> getPricebyProduct(String productName);

}
