package com.sapient.product.client;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sapient.entity.Product;

/**
 * 
 * @author Jagadish Bidarkoti
 *
 */
public class ProductServiceClientImplTest {

	@Autowired
	ProductServiceClient productServiceClient;
	

    final String productName = "McAfee";
    final String productType= "Software";
    final double productPrice = 83781.4;
    
	@Test
	public void testGetPricebyProduct() {
		productServiceClient=new ProductServiceClientImpl();
		List<Product> product = productServiceClient.getPricebyProduct(productName);
		Assert.assertNotNull(product);
		Product oneProduct= product.get(0);
		Assert.assertEquals(productName, oneProduct.getProductName());
	}

}
