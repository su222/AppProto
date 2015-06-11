package com.su.model;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.su.service.UserService;

@RestController
public class UserController {
	private final UserService userService;

	@Inject
	public UserController(final UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public User createUser(@RequestBody @Valid final User user) {
		return userService.save(user);
	}
}
