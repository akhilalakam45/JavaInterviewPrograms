package com.practice.customexceptions;

public class BaseException extends Exception{
	
	private String message;
	private int statusCode;
	private String description;
	
	
	public BaseException(String message, int statusCode, String description) {
		this.message = message;
		this.statusCode = statusCode;
		this.description = description;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public int getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
}
