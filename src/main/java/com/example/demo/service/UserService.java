package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	public UserRepository repo;

	public User saveUser(User user) {
		return repo.save(user);
	}

	public User findUser(String username) {
		return repo.findByUsername(username);
	}

	public Iterable<User> getAllUser() {
		return repo.findAll();
	}

	public Iterable<User> deleteUser(String id) {
//		User user = repo.findByUsername(username);
//		repo.delete(user);		
		repo.deleteById(id);
		return repo.findAll();
	}
}
