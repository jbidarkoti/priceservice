package com.sapient.product.client.exception;

import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 
 * @author Jagadish Bidarkoti
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductServiceClientException extends RuntimeException{

	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	protected Logger logger= Logger.getLogger(ProductServiceClientException.class.getName());
	
	/**
	 * Exception id there are no products found
	 * @param productName
	 */
	public ProductServiceClientException(String productName){
		super("No Such Product : " + productName + " found");
		logger.warning("No Such Product : " + productName + " found");
	}
	
}
