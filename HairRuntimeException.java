package com.homework.groupofstudents;

public class HairRuntimeException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4892447886162910319L;
	
	private String message;

	public HairRuntimeException(String message) {
		super();
		this.message = message;
	}

	public HairRuntimeException() {
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
		return "HairRuntimeException [message=" + message + "]";
	}
	

}
