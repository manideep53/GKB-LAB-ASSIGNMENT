package com.gskLab;

import java.util.Date;

public class User {

	private int id;
	private String name;
	private String email;
	private int age;
	private Date dateOfBirth;




	public User() {

	}
	public User(int id, String name, String email, int age, Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
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




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public Date getDateOfBirth() {
		return dateOfBirth;
	}




	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}






}
