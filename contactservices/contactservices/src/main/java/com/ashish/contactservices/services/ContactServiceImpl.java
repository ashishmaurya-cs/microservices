package com.ashish.contactservices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ashish.contactservices.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{
	//
	
	List<Contact> list = List.of(
			new Contact(11L, "ac23@gmail.com","ajeet",101L),
			new Contact(14L, "ac23@gmail.com","ajeet",101L),
			new Contact(12L, "ac23243@gmail.com","anil",102L),
			new Contact(13L, "ac23890@gmail.com","amit",103L));
	@Override
	public List<Contact> getContactOfUser(Long userID) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact -> contact.getUserID().equals(userID)).collect(Collectors.toList());
	}

}
