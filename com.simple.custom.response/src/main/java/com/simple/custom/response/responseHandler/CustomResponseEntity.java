package com.simple.custom.response.responseHandler;

import java.io.Serializable;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component("customResponseEntity")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomResponseEntity extends ResponseEntity<CustomResponse> implements Serializable {
	private static final long serialVersionUID = 1L;

	public CustomResponseEntity(CustomResponse response, HttpStatus status) {
		super(response, status);
	}

}