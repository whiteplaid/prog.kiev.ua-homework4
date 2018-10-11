package com.homework.groupofstudents;

public class MyArrayIndexOutOfBoundsException extends ArrayIndexOutOfBoundsException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public MyArrayIndexOutOfBoundsException(String message) {
		super();
		this.message = message;
	}

	public MyArrayIndexOutOfBoundsException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyArrayIndexOutOfBoundsException(int index) {
		super(index);
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Exception [message= " + message + "]";
	}
	
}
