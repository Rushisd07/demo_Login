package com.assignment.demoLogin.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.demoLogin.bean.Auth_Status;
import com.assignment.demoLogin.bean.Request_Login;

@RestController
@RequestMapping("login")
public class LoginRestController {
	
	private static final String AUTH_STATUS_SUCCESS = "Success";
	private static final String AUTH_STATUS_DECLINE = "Failure";
	
	@PostMapping("submitform")		//declare method="post" in login form
	public Auth_Status Validate_User(@ModelAttribute("submitform") Request_Login req) {
		
		//Create object of Auth_Status bean to store status into it
		Auth_Status aus = new Auth_Status();
		
		if(req.getUsername().equals("Admin") && req.getPass().equals("admin")){
			aus.setAuth(AUTH_STATUS_SUCCESS);
		}
		else {
			aus.setAuth(AUTH_STATUS_DECLINE);
		}
		return aus;
		
	}
	
}
