package com.ashish.contactservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.contactservices.entity.Contact;
import com.ashish.contactservices.services.ContactServiceImpl;

@RestController
public class ContactController {
	
	@Autowired
	private ContactServiceImpl contactServiceImpl;
	
	@RequestMapping(value = "/contact/user/{userID}", method = RequestMethod.GET)
	public List<Contact> getContacts(@PathVariable("userID") Long userID) {
		return contactServiceImpl.getContactOfUser(userID);
	}
}
