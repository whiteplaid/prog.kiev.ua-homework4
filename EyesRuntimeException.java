package com.homework.groupofstudents;

public class EyesRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 561403970141056312L;
	
	private String message;

	public EyesRuntimeException(String message) {
		super();
		this.message = message;
	}

	public EyesRuntimeException() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "EyesRuntimeException [message=" + message + "]";
	}
	

}
