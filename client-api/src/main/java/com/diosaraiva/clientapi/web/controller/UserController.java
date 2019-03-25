package com.diosaraiva.clientapi.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.diosaraiva.clientapi.model.User;
import com.diosaraiva.clientapi.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@ResponseBody
	@RequestMapping(value= "/users", method = RequestMethod.POST,
	produces= {MediaType.APPLICATION_JSON_VALUE})
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@ResponseBody
	@RequestMapping(value= "/users", method = RequestMethod.GET,
	produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<User>> getAllUsers() {
		return ResponseEntity.ok(userService.getAllUsers());
	}

	@ResponseBody
	@RequestMapping(value= "/users/{id}", method = RequestMethod.GET,
	produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<User> getUser(@PathVariable long userId){
		return ResponseEntity.ok(userService.getUser(userId));
	}

	@ResponseBody
	@RequestMapping(value= "/users/{id}", method = RequestMethod.PUT,
	produces= {MediaType.APPLICATION_JSON_VALUE})
	public void updateUser(@PathVariable long userId, @RequestBody User user) {
		userService.updateUser(userId, user);
	}

	@ResponseBody
	@RequestMapping(value= "/users/{id}", method = RequestMethod.DELETE,
	produces= {MediaType.APPLICATION_JSON_VALUE})
	public void deleteUser(@PathVariable long userId) {
		userService.deleteUser(userId);
	}
}