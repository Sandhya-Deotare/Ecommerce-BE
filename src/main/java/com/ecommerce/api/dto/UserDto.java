package com.ecommerce.api.dto;

public class UserDto {

private int id;
	
	private String name;
	private String gender;
	private String emailId;
	private long phoneNo;
	private boolean isArchive;
	
	public UserDto() {
		super();
	}

	public UserDto(int id, String name, String gender, String emailId, long phoneNo, boolean isArchive) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.isArchive = isArchive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public boolean isArchive() {
		return isArchive;
	}

	public void setArchive(boolean isArchive) {
		this.isArchive = isArchive;
	}
	
}
