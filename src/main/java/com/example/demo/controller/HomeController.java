package com.example.demo.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class HomeController {

	@Autowired
	private UserService service;

	@CrossOrigin
	@PostMapping("/user")
	@Transactional
	public String getRegister(@RequestBody User user) {
		service.saveUser(user);
		return "Hello, welcome to the site, your username is: " + user.getUsername();
	}

	@CrossOrigin
	@GetMapping("/user")
	public Iterable<User> findAllUser() {
		return service.getAllUser();
	}

	@CrossOrigin
	@GetMapping("/user/{username}")
	@Transactional
	public User getByUsername(@PathVariable String username) {
		return service.findUser(username);
	}

	@CrossOrigin
	@DeleteMapping("/user/{id}")
	@Transactional
	public Iterable<User> deleteUser(@PathVariable String id) {
		service.deleteUser(id);
		return service.getAllUser();
	}
}
