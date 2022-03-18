package org.sqli.authentification.service;

import org.sqli.authentification.entitie.User;

public interface UserService {
	
	//void save (User user);
	User verifyAuthentification(User user);

}
