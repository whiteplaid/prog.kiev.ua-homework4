package com.homework.groupofstudents;

public class EmptyFieldRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5462295435994977485L;

	private String message;

	public EmptyFieldRuntimeException(String message) {
		super();
		this.message = message;
	}

	public EmptyFieldRuntimeException() {
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
		return "EmptyFieldRuntimeException [message=" + message + "]";
	}
	
}
