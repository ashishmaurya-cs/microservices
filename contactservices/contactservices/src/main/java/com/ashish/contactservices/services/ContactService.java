package com.ashish.contactservices.services;

import java.util.List;

import com.ashish.contactservices.entity.Contact;

public interface ContactService {
	public List<Contact> getContactOfUser(Long userID);
}
