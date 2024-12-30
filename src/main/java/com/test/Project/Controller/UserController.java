package com.test.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.Project.model.User;
import com.test.Project.service.PasswordService;



@RestController
@RequestMapping("user")
public class UserController {
	
	
	@Autowired
	private PasswordService passwordService;
	
	
		@PostMapping
		public String addUser(@RequestBody User user) {
						
			return passwordService.insertUser(user);
			
			
		}


}























