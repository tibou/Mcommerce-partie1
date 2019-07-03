package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ProduitGratuitException extends Exception {

	public ProduitGratuitException(String message) {
		super(message);
	}
	
}
