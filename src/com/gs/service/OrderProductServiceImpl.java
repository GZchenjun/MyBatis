package com.gs.service;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gs.bean.OrderProduct;
import com.gs.common.MyBatisUtil;
import com.gs.common.bean.Pager4EasyUI;
import com.gs.dao.OrderProductDAO;

public class OrderProductServiceImpl implements OrderProductService{

	private OrderProductDAO orderProductDAO;
	private SqlSession session;
	
	public OrderProductServiceImpl() {
		session = MyBatisUtil.getSessionFactory().openSession();
		orderProductDAO = session.getMapper(OrderProductDAO.class); // 返回由MyBatis自动生成的指定接口的实现类
	}

	@Override
	public List<OrderProduct> queryAll() {
		List<OrderProduct> orderProducts = orderProductDAO.queryAll();
		session.close();
		return orderProducts;
	}

	@Override
	public OrderProduct queryById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(OrderProduct t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(OrderProduct t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pager4EasyUI<OrderProduct> queryByPagerAndCriteria(Pager4EasyUI<OrderProduct> pager, OrderProduct t) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
