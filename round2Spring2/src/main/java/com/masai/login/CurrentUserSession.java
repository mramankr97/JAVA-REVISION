package com.masai.login;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@jakarta.persistence.Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CurrentUserSession {
	
	@jakarta.persistence.Id
	@jakarta.persistence.Column(unique = true)
	private Integer userId;
	
	
	private String uuid;
	
	private LocalDateTime localDateTime;

}
