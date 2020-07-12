package com.example.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mysql.model.Users;
import com.example.mysql.repository.DataRepository;

@RestController
public class UserController {

	@Autowired
	private DataRepository dataRepository;
	
	@GetMapping("/data")
	public List<Users>  findAll()
	{
		return dataRepository.findAll();
	}
	
	@PostMapping("/user")
	public Users insertUser(@RequestBody Users user)
	{
		dataRepository.save(user);
		return user;
	}
	
}
