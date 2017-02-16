package com.gs.test;

import java.util.List;

import org.junit.Test;

import com.gs.bean.Product;
import com.gs.common.bean.Pager4EasyUI;
import com.gs.service.ProductService;
import com.gs.service.ProductServiceImpl;

import junit.framework.TestCase;

public class ProductServiceTest extends TestCase {

	private ProductService ps;
	
	@Override
	protected void setUp() throws Exception {
		ps = new ProductServiceImpl();
	}

	@Test
	public void testQueryAll() {
		List<Product> pss = ps.queryAll();
		for (Product p : pss) {
			System.out.println(p);
		}
	}
	
	@Test
	public void testQueryById() {
		System.out.println(ps.queryById(1));
	}
	
	@Test
	public void testAdd() {
		Product p = new Product();
		p.setName("p3");
		p.setPrice(12);
		ps.add(p);
	}
	
	@Test
	public void testAdd1() {
		ps.add1("p4", 19);
	}
	
	@Test
	public void testUpdate() {
		Product p = new Product();
		p.setId(1);
		p.setName("new p1");
		p.setPrice(100);
		ps.update(p);
	}
	
	@Test
	public void testDelete() {
		ps.deleteById(1);
	}
	
	@Test
	public void testQueryByPager() {
		Pager4EasyUI<Product> pager = new Pager4EasyUI<>();
		pager.setPageNo(1);
		pager.setPageSize(2);
		Product t = new Product();
		t.setName("4");
		pager = ps.queryByPagerAndCriteria(pager, t);
		System.out.println(pager.getTotal());
		if (pager.getRows() != null && pager.getRows().size() > 0) {
			for (Product p : pager.getRows()) {
				System.out.println(p.getName() + ", " + p.getPrice());
			}
		}
	}
	
	
}
