package com.gs.service;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gs.bean.Emp;
import com.gs.common.MyBatisUtil;
import com.gs.common.bean.Pager4EasyUI;
import com.gs.dao.EmpDAO;

public class EmpServiceImpl implements EmpService{

	private EmpDAO empDAO;
	private SqlSession session;
	
	public EmpServiceImpl() {
		session = MyBatisUtil.getSessionFactory().openSession();
		empDAO = session.getMapper(EmpDAO.class); // 返回由MyBatis自动生成的指定接口的实现类
	}

	@Override
	public List<Emp> queryAll() {
		List<Emp> emps = empDAO.queryAll();
		session.close();
		return emps;
	}

	@Override
	public Emp queryById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Emp t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Emp t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pager4EasyUI<Emp> queryByPagerAndCriteria(Pager4EasyUI<Emp> pager, Emp t) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
