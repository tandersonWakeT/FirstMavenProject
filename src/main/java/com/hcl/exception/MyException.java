package com.hcl.exception;

//User defined exception
public class MyException extends Exception {
	
	private String message;
	
	public MyException(String e) {
		this.message = e;
	}
	
	public String toString() {
		return this.message;
	}
}
