package com.gs.test;

import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;

import com.gs.bean.OrderProduct;
import com.gs.bean.Product;
import com.gs.service.OrderProductService;
import com.gs.service.OrderProductServiceImpl;

import junit.framework.TestCase;

public class OrderProductServiceTest extends TestCase {

	private OrderProductService ps;
	
	@Override
	protected void setUp() throws Exception {
		ps = new OrderProductServiceImpl();
	}

	@Test
	public void testQueryAll() {
		List<OrderProduct> pss = ps.queryAll();
		for (OrderProduct p : pss) {
			System.out.println("订单编号" + p.getOrder().getId() + "时间" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(p.getOrder().getOrderTime()) + "用户" + p.getOrder().getUser().getName());
			System.out.println("购买了商品：");
			List<Product> ps = p.getProducts();
			for (Product pp : ps) {
				System.out.println(pp.getName() + "   " + pp.getPrice());
			}
		}
	}
	
}
