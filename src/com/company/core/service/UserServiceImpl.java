package com.company.core.service;

import com.company.core.database.Database;
import com.company.core.database.UserDatabase;
import com.company.core.model.User;

import java.util.List;

/**
 *
 */
public class UserServiceImpl implements UserService
{
	private Database userDb = new UserDatabase();
	
	@Override
	public void addUser(User user)
	{
		userDb.saveUser(user);
	}
	
	@Override
	public void removeUser(User user)
	{
		userDb.deleteUser(user);
	}
	
	@Override
	public List<User> getAllUsers()
	{
		return userDb.getAll();
	}
	
	@Override
	public void saveAllUsersOnExit()
	{
		userDb.saveAllOnExit();
	}
	
	@Override
	public List<User> initUserDatabaseOnStart()
	{
		return userDb.initDatabaseOnStart();
	}
}
