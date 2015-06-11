package com.su.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.su.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;
	
    @RequestMapping("/login")
    public boolean greeting(@RequestBody User user) {
    	return loginService.login(user);
    }
}
