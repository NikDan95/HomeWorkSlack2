package com.company.core.database;

import com.company.core.model.User;
import com.company.core.util.FileUtil;
import com.company.core.util.FileUtilImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * comments
 */
public class UserDatabase implements Database
{
	private static final List<User> userDatabase = new ArrayList<>();
	private static final FileUtil FILE_RW = new FileUtilImpl();
	@Override
	public void saveUser(User user)
	{
		userDatabase.add(user);
	}
	
	@Override
	public void deleteUser(User user)
	{
		userDatabase.removeIf(user::equals);
	}
	
	@Override
	public List<User> getAll()
	{
		return userDatabase;
	}
	
	@Override
	public void saveAllOnExit()
	{
		FILE_RW.writeUsersToFile(userDatabase);
	}
	
	@Override
	public List<User> initDatabaseOnStart()
	{
		return FILE_RW.readUsersFromFile();
	}
}
