package org.sqli.authentification.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.sqli.authentification.entitie.User;

public interface UserDAO extends JpaRepository <User, Integer> {
	
	User findByLoginAndPasswd(String login, String password);
	List<User> findByLogin(String login);

}
