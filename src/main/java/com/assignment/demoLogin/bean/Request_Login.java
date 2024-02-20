package com.assignment.demoLogin.bean;

//This is a bean for injecting username and password
public class Request_Login {
	private String username;
	private String pass;
	public Request_Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Request_Login(String username, String pass) {
		super();
		this.username = username;
		this.pass = pass;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Request_Login [username=" + username + ", pass=" + pass + "]";
	}
	
}
