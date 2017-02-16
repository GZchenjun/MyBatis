package com.gs.test;

import java.util.List;

import org.junit.Test;

import com.gs.bean.Order;
import com.gs.service.OrderService;
import com.gs.service.OrderServiceImpl;

import junit.framework.TestCase;

public class OrderServiceTest extends TestCase {

	private OrderService ps;
	
	@Override
	protected void setUp() throws Exception {
		ps = new OrderServiceImpl();
	}

	@Test
	public void testQueryAll() {
		List<Order> pss = ps.queryAll();
		for (Order p : pss) {
			System.out.println(p.getOrderTime() + p.getUser().getName());
		}
	}
	
}
