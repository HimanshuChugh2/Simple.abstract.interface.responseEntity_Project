package com.simple.custom.response.controller;

import org.springframework.http.HttpStatus;

import com.simple.custom.response.enums.ResponseMessage;
import com.simple.custom.response.responseHandler.CustomResponse;
import com.simple.custom.response.responseHandler.CustomResponseEntity;

/*
Every controller in this project must extend this class 

*/
public abstract class AbstractController {
	public CustomResponseEntity generateResponse(ResponseMessage responseMessage, String[] args, HttpStatus status,
			Object data) {

		CustomResponseEntity customResponseEntity = new CustomResponseEntity(new CustomResponse(responseMessage, data),
				status);
		customResponseEntity.getBody().setData(data);
		customResponseEntity.getBody().setMessage(responseMessage);
		return customResponseEntity;
	}
}