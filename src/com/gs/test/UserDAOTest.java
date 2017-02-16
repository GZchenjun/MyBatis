package com.gs.test;

import java.util.List;

import org.junit.Test;

import com.gs.bean.User;
import com.gs.dao.UserDAO;
import com.gs.dao.UserDAOImpl;

import junit.framework.TestCase;

public class UserDAOTest extends TestCase {
	
	private UserDAO userDAO;
	
	@Override
	protected void setUp() throws Exception {
		userDAO = new UserDAOImpl();
	}

	@Test
	public void testQueryAll() {
		List<User> users = userDAO.queryAll();
		for (User u : users) {
			System.out.println(u);
		}
	}

}
