package com.company.core.util;

import com.company.core.model.User;

import java.io.File;
import java.util.List;

/**
 *
 */
public interface FileUtil
{
	List<User> readUsersFromFile();
	
	void writeUsersToFile(List<User> users);
}
