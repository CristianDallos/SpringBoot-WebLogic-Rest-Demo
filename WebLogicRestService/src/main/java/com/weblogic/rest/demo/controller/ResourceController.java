package com.weblogic.rest.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resource")
public class ResourceController {

	@GetMapping("/test")
	String readResource() {
		return "hello! Welcome to springboot + weblogic rest service !";
	}
	
}