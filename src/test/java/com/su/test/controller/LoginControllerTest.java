package com.su.test.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.su.model.LoginController;

@RunWith(MockitoJUnitRunner.class)
public class LoginControllerTest {

	//@Mock
	//private LoginService loginService;
	
	private LoginController loginController;
	
	@Before
	public void setUp() {
		loginController = new LoginController();
	}
	
	@Test
	public void loginTest() throws Exception {
		//final User user = 
		//loginController.log
	}
}
