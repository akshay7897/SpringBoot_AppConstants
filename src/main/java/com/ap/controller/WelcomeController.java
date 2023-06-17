package com.ap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.property.AppConstants;
import com.ap.property.AppProperties;

@RestController
public class WelcomeController {
	
	@Autowired
	private AppProperties appProperties;
	
	@GetMapping("welcome")
	public String welcome() {
		return appProperties.getMessages().get(AppConstants.WELCOME_MSG);
	}
	
	@GetMapping("greet")
	public String greet() {
		return appProperties.getMessages().get(AppConstants.GREET_MSG);
	}

}
