package com.simple.custom.response.responseHandler;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.simple.custom.response.enums.ResponseMessage;

@Component("customResponse")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomResponse {
	public CustomResponse() {
		super();
	}

	public CustomResponse(ResponseMessage responseMessage, Object data2) {
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

	private ResponseMessage message;
	private Object data;

	/**
	 * Gets the {@link ResponseMessage}
	 * 
	 * @return {@link ResponseMessage} - the message
	 */
	public ResponseMessage getMessage() {
		return message;
	}

	/**
	 * Sets the {@link ResponseMessage}
	 * 
	 * @param message - the message
	 */
	public void setMessage(ResponseMessage message) {
		this.message = message;
	}

	/**
	 * Gets the data set in response
	 * 
	 * @return Object - data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * Sets the data in response
	 * 
	 * @param data - to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Response [message=" + message + ", data=" + data + "]";
	}

}
