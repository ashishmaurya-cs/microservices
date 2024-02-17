package com.ashish.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAppController {
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String index() {
		return "It is a main page";
	}
	
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String hello() {
		return "Hello Page";
	}
	
	@RequestMapping(value = "/welcome",method = RequestMethod.GET)
	public String welcome() {
		return "Welcome page";
	}
}
