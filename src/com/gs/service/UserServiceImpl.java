package com.gs.service;

import java.io.Serializable;
import java.util.List;

import com.gs.bean.User;
import com.gs.common.MyBatisUtil;
import com.gs.common.bean.Pager4EasyUI;
import com.gs.dao.UserDAO;

public class UserServiceImpl implements UserService {
	
	private UserDAO userDAO;
	
	public UserServiceImpl() {
		userDAO = MyBatisUtil.getSessionFactory().openSession().getMapper(UserDAO.class); // 返回由MyBatis自动生成的指定接口的实现类
	}
	
	@Override
	public List<User> queryAll() {
		return userDAO.queryAll();
	}

	@Override
	public User queryById(Serializable id) {
		return null;
	}

	@Override
	public void add(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pager4EasyUI<User> queryByPagerAndCriteria(Pager4EasyUI<User> pager, User t) {
		// TODO Auto-generated method stub
		return null;
	}

}
