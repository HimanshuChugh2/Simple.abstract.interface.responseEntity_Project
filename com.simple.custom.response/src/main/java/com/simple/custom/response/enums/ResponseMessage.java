package com.simple.custom.response.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ResponseMessage {

	USER_ADD_SUCCESS("USER ADDED SUCCESSFULLY"),
	USER_ADD_FAIL("USER WAS NOT ADDED SUCCESSFULLY"),
	DATA_RETRIEVE_SUCCESS("DATA WAS FETCHED SUCCESSFULLY"),
	DATA_RETRIEVE_FAIL("DATA WAS NOT FETCHED SUCCESSFULLY");
	// USER_ADD_FAIL, DATA_RETRIEVE_SUCCESS, DATA_RETRIEVE_FAIL;
	private final String message;

	ResponseMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
 

//
//	private final String hexCode;
//
//	ResponseMessage(String hexCode) {
//		this.hexCode = hexCode;
//	}
//
//	public String getHexCode() {
//		return hexCode;
//	}

}