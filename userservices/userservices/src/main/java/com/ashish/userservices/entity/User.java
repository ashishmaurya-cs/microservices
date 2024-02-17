package com.ashish.userservices.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	private Long userId;
	private String name;
	List<Contact> contacts = new ArrayList<>();

	public User() {

	}

	public User(Long userId, String name, List<Contact> contacts) {
		this.userId = userId;
		this.name = name;
		this.contacts = contacts;
	}

	public User(Long userId, String name) {
		this.userId = userId;
		this.name = name;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

}
