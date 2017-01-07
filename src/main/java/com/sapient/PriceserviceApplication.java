package com.sapient;

/**
 * Retrieving the Product price from product catalog service from different application invoking the endpoints
 * Thsi way keeping intact of microservice way.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sapient.product.client.ProductServiceClient;
import com.sapient.product.client.ProductServiceClientImpl;
/**
 * 
 * @author Jagadish Bidarkoti
 *
 */
@SpringBootApplication
public class PriceserviceApplication {

	public static void main(String[] args) {
		
		ProductServiceClient productServiceClient=new ProductServiceClientImpl();
		productServiceClient.getPricebyProduct("Lenovo");
		
		SpringApplication.run(PriceserviceApplication.class, args);
	}
}
