package com.company.core;

import com.company.core.model.User;
import com.company.core.service.UserService;
import com.company.core.service.UserServiceImpl;

import java.util.Scanner;

public class Program
{
	private static final String EXIT_COMMAND = "exit";
	private static final String ADD_COMMAND = "add";
	private static final String REMOVE_COMMAND = "remove";
	private static final String GET_ALL_COMMAND = "all";
	private final static UserService userService = new UserServiceImpl();
	
	public static void start()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("Hello and welcome to user database");
		
		for (;;)
		{ // new change
			String name;
			int age;
			User tempUser = new User();
			System.out.println("Please add a new user");
			System.out.println("Enter user name");
			name = scanner.nextLine();
			System.out.println("Now enter user age");
			age = scanner.nextInt();
			tempUser.setName(name);
			tempUser.setAge(age);
			System.out.println(tempUser);
			
			
			
		}
	}
}
