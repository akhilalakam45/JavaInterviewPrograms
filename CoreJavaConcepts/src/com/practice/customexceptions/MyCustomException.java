package com.practice.customexceptions;

public class MyCustomException extends Exception {
	
	private int errorCode;
	private String errorMsg;
	
	public MyCustomException(ExceptionCode code) {
		this.errorCode = code.getId();
		this.errorMsg = code.getMsg();
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
