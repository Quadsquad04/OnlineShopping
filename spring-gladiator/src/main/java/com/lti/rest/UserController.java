package com.lti.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.User;
import com.lti.repo.UserRepo;

@RestController
public class UserController {

	@Autowired
	private UserRepo repo;
	
	@PostMapping(value="/add",consumes="application/json")
	public String addUser(@RequestBody User usr) {
		repo.save(usr);
		return "User added successfully";
	}


}
