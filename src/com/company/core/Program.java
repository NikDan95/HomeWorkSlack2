package com.company.core;

import com.company.core.model.User;
import com.company.core.service.UserService;
import com.company.core.service.UserServiceImpl;

import java.util.Scanner;

public class Program
{
	private static final String START_COMMAND = "start";
	private static final String EXIT_COMMAND = "exit";
	private static final String INFO_COMMAND = "info";
	private static final String ADD_COMMAND = "add";
	private static final String REMOVE_COMMAND = "remove";
	private static final String GET_ALL_COMMAND = "all";
	private final static UserService userService = new UserServiceImpl();
	private static final Scanner SCANNER = new Scanner(System.in);
	
	public static void start()
	{
		userService.initUserDatabaseOnStart();
		System.out.println();
		System.out.println("Hello and welcome to user database, use 'info' command to see all available commands");
		System.out.println(userService.getAllUsers());
		for (; ; )
		{
			
			/////////////////// anyMethod();
			String inputCommand = SCANNER.nextLine();
			checkCOmmand(inputCommand);
		
		}
	}
	
	private static void getProgramInfo()
	{
		//fill the commands info
		System.out.println(" Hello you can <add> <remove> <exit> <all> commandes \n add- you can with this method add user \n remove - you can with this command remove user \n exit- with this method you can close this program \n all- yoc can see all the users from db");
	}
	
	private static void checkCOmmand(String command)
	{
		switch (command)
		{
			case "start":
				startProgram();
				break;
			case "exit":
				exitProgram();
				break;
			case "info":
				getProgramInfo();
				break;
			case "add":
				addUser();
				break;
			case "remove":
				removeThisUser();
				break;
			case "all":
				allUsers();
				break;
			
		}
	}
	
	private static void startProgram()
	{
		for (; ; )
		{
			System.out.println("Please enter user name");
			String commander = SCANNER.nextLine();
			checkCOmmand(commander);
			/*String name = SCANNER.nextLine();
			System.out.println("Please enter user age");
			int age = SCANNER.nextInt();
			userService.addUser(new User(name, age));*/
			
			//exitProgram();
		}
	}
	
	private static void exitProgram()
	{
		userService.saveAllUsersOnExit();
		System.exit(0);
	}
	
	private static void allUsers()
	{
	userService.getAllUsers();
	}
	
	private static void removeThisUser()
	{
		System.out.println("please write user name which will be deleted ");
		String name = SCANNER.nextLine();
		System.out.println("Please enter user age");
		int age = SCANNER.nextInt();
	userService.removeUser(new User(name, age));
	}
	
	private static void addUser()
	{
		System.out.println("Please enter user name");
		String name = SCANNER.nextLine();
		System.out.println("Please enter user age");
		int age = SCANNER.nextInt();
		userService.addUser(new User(name, age));
	}
	
}
