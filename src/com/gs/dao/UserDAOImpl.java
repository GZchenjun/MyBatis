package com.gs.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gs.bean.User;
import com.gs.common.bean.Pager4EasyUI;

public class UserDAOImpl extends AbstractBaseDAO implements UserDAO {

	@Override
	public List<User> queryAll() {
		getSessionFactory();
		SqlSession session = sessionFactory.openSession();
		List<User> users = session.selectList("com.gs.bean.User.queryUser");
		session.close();
		return users;
	}

	@Override
	public User queryById(Serializable id) {
		// TODO Auto-generated method stub
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
	public List<User> queryByPagerAndCriteria(Pager4EasyUI<User> pager, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countByCriteria(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
