package com.cg.tca_application.exception;

public class InvalidEmployeeId extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidEmployeeId()
	{
		super();
	}
	public InvalidEmployeeId(String message)
	{
		super(message);
	}
}
