package com.assignment.demoLogin.bean;

//This is a bean for storing authentication status as "Success" / "Failure"
public class Auth_Status {
	private String auth;

	public Auth_Status() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auth_Status(String auth) {
		super();
		this.auth = auth;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	@Override
	public String toString() {
		return "Auth_Status [auth=" + auth + "]";
	}
	
}
