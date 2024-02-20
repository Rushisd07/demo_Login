package com.assignment.demoLogin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.assignment.demoLogin.bean.Request_Login;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String showHomePage() {
		return "index";	
	}
	
	@GetMapping("login")
	public String loginPage(Model m) {
		Request_Login req = new Request_Login();
		m.addAttribute("submitform",req);	//Inject that username and password from req object to "submitform"
		return "login";
	}
	
}
