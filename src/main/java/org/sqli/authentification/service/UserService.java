package org.sqli.authentification.service;

import org.sqli.authentification.entitie.User;

public interface UserService {
	
	User createUser (User user);
	User verifyAuthentification(User user);

}
