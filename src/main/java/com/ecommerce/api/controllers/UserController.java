package com.ecommerce.api.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.ecommerce.api.dto.UserDto;
import com.ecommerce.api.payload.ApiResponse;
import com.ecommerce.api.services.UserService;

import io.swagger.annotations.Api;


@RestController
@RequestMapping("/api")
@Api(value = "Blog Application", protocols = "http")
@EnableWebMvc
public class UserController {

	@Autowired
	private UserService userService;

	// create user
	@PostMapping("/users/add")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {

		UserDto createUserDto = this.userService.createUser(userDto);
		
		return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
	}

	// update user
	@PutMapping("/users/{userId}")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto, @PathVariable("userId") Integer uid) {

		UserDto updatedUser = this.userService.updateUser(userDto, uid);

		return ResponseEntity.ok(updatedUser);
	}

	// delete user
	@DeleteMapping("/users/{userId}")
	public ResponseEntity<?> deleteUser(@PathVariable("userId") Integer uid) {

		this.userService.deleteUser(uid);

		return new ResponseEntity(new ApiResponse("User deleted Successfully", true), HttpStatus.OK);
	}

	// get user
	@GetMapping("/users/all")
	public ResponseEntity<List<UserDto>> getAllUser() {

		return ResponseEntity.ok(this.userService.getAllUsers());
	}

	@GetMapping("/users/{userId}")
	public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userId) {
		return ResponseEntity.ok(this.userService.getUserById(userId));
	}
}

