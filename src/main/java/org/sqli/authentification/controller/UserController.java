package org.sqli.authentification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.sqli.authentification.entitie.User;
import org.sqli.authentification.service.UserService;

@Controller
@RequestMapping("/User")
public class UserController {
	
	@Autowired 
	private UserService userService;
	
	@PostMapping("/auth")
	
	public ResponseEntity<User> connect(@RequestBody User user){
		return ResponseEntity.ok().body(this.userService.verifyAuthentification(user));
		
	}

}
