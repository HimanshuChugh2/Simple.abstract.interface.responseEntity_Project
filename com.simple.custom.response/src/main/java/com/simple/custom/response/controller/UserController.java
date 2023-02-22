package com.simple.custom.response.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simple.custom.response.entity.UserEntity;
import com.simple.custom.response.enums.ResponseMessage;
import com.simple.custom.response.repo.UserRepository;
import com.simple.custom.response.responseHandler.CustomResponseEntity;
import com.simple.custom.response.service.UserService;

@RestController
public class UserController extends AbstractController {

	@Autowired
	UserService userService;

	public UserController(UserService userService, UserRepository userRepository) {
		this.userService = userService;
	}

	// Add
	@PostMapping(value = "/users")
	public CustomResponseEntity addUser(@RequestBody UserEntity user) {
		UserEntity result = null;
		try {
			result = userService.saveUser(user);
			return generateResponse(ResponseMessage.USER_ADD_SUCCESS, null, HttpStatus.OK, result);
		} catch (Exception e) {
			return generateResponse(ResponseMessage.USER_ADD_FAIL, e.getMessage().split(" "),
					HttpStatus.INTERNAL_SERVER_ERROR, result);
		}

	}

	// Get
	@GetMapping(value = "/list-users")
	public CustomResponseEntity listUsers() {
		List<UserEntity> result = null;
		try {
			result = userService.listAllUsers();
			return generateResponse(ResponseMessage.DATA_RETRIEVE_SUCCESS, null, HttpStatus.OK, result);
		} catch (Exception e) {
			return generateResponse(ResponseMessage.DATA_RETRIEVE_FAIL, e.getMessage().split(" "),
					HttpStatus.INTERNAL_SERVER_ERROR, result);
		}
	}

}