package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	private int id;
	
	
	private String name;
	private int phoneNo;
	private String dateOfBirth;
	Email email;
	
	
}
