package com.gs.dao;

import org.apache.ibatis.session.SqlSessionFactory;

import com.gs.common.MyBatisUtil;

public abstract class AbstractBaseDAO {
	
	SqlSessionFactory sessionFactory = null;
	
	public void getSessionFactory() {
		sessionFactory = MyBatisUtil.getSessionFactory();
	}

}
