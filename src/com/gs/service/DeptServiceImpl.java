package com.gs.service;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gs.bean.Dept;
import com.gs.common.MyBatisUtil;
import com.gs.common.bean.Pager4EasyUI;
import com.gs.dao.DeptDAO;

public class DeptServiceImpl implements DeptService{

	private DeptDAO deptDAO;
	private SqlSession session;
	
	public DeptServiceImpl() {
		session = MyBatisUtil.getSessionFactory().openSession();
		deptDAO = session.getMapper(DeptDAO.class); // 返回由MyBatis自动生成的指定接口的实现类
	}

	@Override
	public List<Dept> queryAll() {
		List<Dept> depts = deptDAO.queryAll();
		session.close();
		return depts;
	}

	@Override
	public Dept queryById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Dept t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Dept t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pager4EasyUI<Dept> queryByPagerAndCriteria(Pager4EasyUI<Dept> pager, Dept t) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
