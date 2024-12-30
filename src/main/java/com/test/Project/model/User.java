package com.test.Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String password;
	
	
	

}
