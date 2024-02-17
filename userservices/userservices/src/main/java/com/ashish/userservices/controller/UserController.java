package com.ashish.userservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ashish.userservices.entity.Contact;
import com.ashish.userservices.entity.User;
import com.ashish.userservices.services.UserServicesIMplementation;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserServicesIMplementation userIMplementation;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/{userID}",method = RequestMethod.GET)
	public User getUser(@PathVariable("userID") Long userID) {
		
		User user =userIMplementation.getUser(userID);
		List<Contact>  contacts=restTemplate.getForObject("http://contact-service/contact/user/"+user.getUserId(), List.class);
		user.setContacts(contacts);
		return user;
//		return userIMplementation.getUser(userID);
		
	}
}
