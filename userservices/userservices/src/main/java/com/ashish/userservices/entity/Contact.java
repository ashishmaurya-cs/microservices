package com.ashish.userservices.entity;

public class Contact {
	private long cid;
	private String email;
	private String contactName;
	private Long userID;

	public Contact() {

	}

	public Contact(long cid, String email, String contactName, Long userID) {
		this.cid = cid;
		this.email = email;
		this.contactName = contactName;
		this.userID = userID;
	}

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

}
