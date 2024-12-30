package com.test.Project.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Project.Repository.PasswordRepo;
import com.test.Project.model.User;



@Service
public class PasswordService {
	
	
	
	
	@Autowired
	private PasswordRepo passwordRepo;
	
	
	public String insertUser(User user) {
		
			
		String password = generatePassword(user.getFirstName(), user.getMiddleName(), user.getLastName());
		
		user.setPassword(password);
		
		passwordRepo.save(user);
	
		return "User inserted";
		
		
	}
	
	
	
	      public String generatePassword(String firstName, String middleName, String lastName) {
	        String initials = firstName.substring(0, 2) + middleName.substring(0, 2) + lastName.substring(0, 2);
	        int randomDigits = new Random().nextInt(900) + 100; // Generate 3-digit random number
	        return initials + randomDigits;
	    }
	      
	      
	      
	    

}





















