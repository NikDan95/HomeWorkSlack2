package com.company.core.service;

import com.company.core.model.User;

import java.util.List;

/**
 * comments
 */
public interface UserService
{
	void addUser(User user);
	
	void removeUser(User user);
	
	List<User> getAllUsers();
	
	void saveAllUsersOnExit();
	
	List<User> initUserDatabaseOnStart();
}
