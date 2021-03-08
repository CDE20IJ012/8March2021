package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	// HAandler method which takes the control to the JSP files
	// while mention the JSP file name we need to just write the 
	// first part of the file name
	
	
	
	@GetMapping("/")
	public String greet()
	{
		  return "index";
	}
}
