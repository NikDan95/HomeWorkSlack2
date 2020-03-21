package com.company.core.database;

import com.company.core.model.User;

import java.util.List;

/**
 * comments
 */
public interface Database
{
	void saveUser(User user);
	
	void deleteUser(User user);
	
	List<User> getAll();
	
	void saveAllOnExit();
	
	void initDatabaseOnStart();
}
