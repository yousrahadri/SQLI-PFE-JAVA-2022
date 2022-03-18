package org.sqli.authentification.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.sqli.authentification.entitie.User;

public interface UserDAO extends JpaRepository <User, Integer> {
	
	User findByLoginAndPasswd(String login, String password);

}
