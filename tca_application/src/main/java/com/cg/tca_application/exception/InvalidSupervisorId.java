package com.cg.tca_application.exception;

public class InvalidSupervisorId extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidSupervisorId()
	{
		super();
	}
	public InvalidSupervisorId(String message)
	{
		super(message);
	}
}
