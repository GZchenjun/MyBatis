package com.gs.service;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gs.bean.OrderInfo;
import com.gs.common.MyBatisUtil;
import com.gs.common.bean.Pager4EasyUI;
import com.gs.dao.OrderInfoDAO;

public class OrderInfoServiceImpl implements OrderInfoService {
	
	private OrderInfoDAO orderInfoDAO;
	private SqlSession session;
	
	public OrderInfoServiceImpl() {
		session = MyBatisUtil.getSessionFactory().openSession();
		orderInfoDAO = session.getMapper(OrderInfoDAO.class); // 返回由MyBatis自动生成的指定接口的实现类
	}

	@Override
	public List<OrderInfo> queryAll() {
		List<OrderInfo> infos = orderInfoDAO.queryAll();
		session.close();
		return infos;
	}

	@Override
	public OrderInfo queryById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(OrderInfo t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(OrderInfo t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pager4EasyUI<OrderInfo> queryByPagerAndCriteria(Pager4EasyUI<OrderInfo> pager, OrderInfo t) {
		// TODO Auto-generated method stub
		return null;
	}

}
