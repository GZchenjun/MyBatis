package com.gs.test;

import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;

import com.gs.bean.OrderInfo;
import com.gs.bean.Product;
import com.gs.service.OrderInfoService;
import com.gs.service.OrderInfoServiceImpl;

import junit.framework.TestCase;

public class OrderInfoServiceTest extends TestCase {

	private OrderInfoService ps;
	
	@Override
	protected void setUp() throws Exception {
		ps = new OrderInfoServiceImpl();
	}

	@Test
	public void testQueryAll() {
		List<OrderInfo> pss = ps.queryAll();
		for (OrderInfo p : pss) {
			System.out.println("订单编号" + p.getOrderId() + "时间" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
					.format(p.getOrderTime()) + "用户" + p.getUserName());
			System.out.println("购买了商品：");
			List<Product> ps = p.getProducts();
			for (Product pp : ps) {
				System.out.println(pp.getName() + "   " + pp.getPrice());
			}
		}
	}
	
}
