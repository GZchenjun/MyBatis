package com.gs.test;

import java.util.List;

import org.junit.Test;

import com.gs.bean.User;
import com.gs.service.UserService;
import com.gs.service.UserServiceImpl;

import junit.framework.TestCase;

public class UserServiceTest extends TestCase {

	private UserService userService;
	 
	@Override
	protected void setUp() throws Exception {
		userService = new UserServiceImpl();
	}
	
	@Test
	public void testQueryAll() {
		List<User> users = userService.queryAll();
		for (User u : users) {
			System.out.println(u);
		}
	}

}
