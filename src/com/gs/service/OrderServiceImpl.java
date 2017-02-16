package com.gs.service;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gs.bean.Order;
import com.gs.common.MyBatisUtil;
import com.gs.common.bean.Pager4EasyUI;
import com.gs.dao.OrderDAO;

public class OrderServiceImpl implements OrderService{

	private OrderDAO orderDAO;
	private SqlSession session;
	
	public OrderServiceImpl() {
		session = MyBatisUtil.getSessionFactory().openSession();
		orderDAO = session.getMapper(OrderDAO.class); // 返回由MyBatis自动生成的指定接口的实现类
	}

	@Override
	public List<Order> queryAll() {
		List<Order> orders = orderDAO.queryAll();
		session.close();
		return orders;
	}

	@Override
	public Order queryById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Order t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Order t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pager4EasyUI<Order> queryByPagerAndCriteria(Pager4EasyUI<Order> pager, Order t) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
