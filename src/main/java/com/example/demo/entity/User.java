package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class User {

	@Id
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	@GeneratedValue(generator = "uuid")
	@Column(nullable = false)
	private String id;
	private String firstname;
	private String lastname;
	private int age;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String username;
	@Column(nullable = false)
	private String password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String id, String firstname, String lastname, int age, String email, String username, String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
