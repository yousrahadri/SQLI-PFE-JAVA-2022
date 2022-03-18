package org.sqli.authentification.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sqli.authentification.dao.GroupDao;
import org.sqli.authentification.dao.UserDAO;
import org.sqli.authentification.entitie.Group;
import org.sqli.authentification.entitie.User;
import org.sqli.authentification.service.Exception.UserNoteFoundException;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDao;

	@Override
	public User verifyAuthentification(User user)  {
		/*
		User us = userDao.findByLoginAndPasswd(user.getLogin(),user.getPassword());
		System.out.println(us);
		return null;
		*/
		User us = userDao.findByLoginAndPasswd(user.getLogin(),user.getPassword());
		if((us.getLogin()==null || us.getPassword()==null) && us.getLoginAttempts()>3) {
			throw new UserNoteFoundException("error: You have reached 3 failed authentication attempts, your account will be disabled");
		}
		return null;
		/*User us = userDao.findByLoginAndPasswd(user.getLogin(),user.getPassword());
		
		if(us.isEnabled()) {
			throw new UserNoteFoundException("User disabled");
		}
		return null;*/
		}
		
		}
		
	
	
	
	

	
	
	
	


