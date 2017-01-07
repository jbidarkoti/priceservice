package com.sapient.product.client;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.sapient.entity.Product;

/**
 * 
 * @author Jagadish Bidarkoti
 *
 */
public class ProductServiceClientImpl implements ProductServiceClient{

	
	protected Logger logger= Logger.getLogger(ProductServiceClientImpl.class.getName());
	
	private RestTemplate restTemplate;
	
	@Override
	public List<Product> getPricebyProduct(String productName) {
		restTemplate = new RestTemplate();
		
	Product [] product=	
	restTemplate.getForObject(
				"http://localhost:1111/products/price/"+productName, Product[].class);
		
	List<Product> list = Arrays.asList(product);
	/*for (Product product2 : product) {
		
		logger.info("PRODUCT NAME : "  + product2.getProductName());
	}
		logger.info("PRODUCT SIZE: " + product.length);
		*/
		return list;
	}

	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
}
