package com.su.test.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.su.model.User;
import com.su.model.UserController;
import com.su.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
	@Mock
	private UserService userService;

	private UserController userController;

	@Before
	public void setUp() {
		userController = new UserController(userService);
	}

	@Test
	public void shouldCreateUser() throws Exception {

		final User savedUser = stubServiceToReturnStoredUser();
		final User user = new User();
		User returnedUser = userController.createUser(user);
		// verify user was passed to UserService
		verify(userService, times(1)).save(user);
		assertEquals("Returned user should come from the service", savedUser,
				returnedUser);
	}

	private User stubServiceToReturnStoredUser() {
		final User user = new User();
		when(userService.save(any(User.class))).thenReturn(user);
		return user;
	}
	
	public void createUserTest() {
		final User myUser = new User();
		when(userService.save(any(User.class))).thenReturn(myUser);
		assertEquals(userController.createUser(new User()), myUser);
		
	}

}
