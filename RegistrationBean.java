package com.cb.beans;

public class RegistrationBean {
	String Firstname;
	String Lastname;
	String Email;
	String ContactNo;
	String Address;
	String Gender;
	String Password;
	String Role;
	
	
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public RegistrationBean(String firstname, String lastname, String email,
			String contactNo, String address, String gender, String password,
			String role) {
		super();
		Firstname = firstname;
		Lastname = lastname;
		Email = email;
		ContactNo = contactNo;
		Address = address;
		Gender = gender;
		Password = password;
		Role = role;
	}
	public RegistrationBean() {
		// TODO Auto-generated constructor stub
	}
	public RegistrationBean(String Email) {
		this.Email = Email;
		}
	
}
	
	
	
	
				