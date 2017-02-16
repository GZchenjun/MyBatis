package com.gs.service;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gs.bean.Product;
import com.gs.common.MyBatisUtil;
import com.gs.common.bean.Pager4EasyUI;
import com.gs.dao.ProductDAO;

public class ProductServiceImpl implements ProductService{

	private ProductDAO productDAO;
	private SqlSession session;
	
	public ProductServiceImpl() {
		session = MyBatisUtil.getSessionFactory().openSession();
		productDAO = session.getMapper(ProductDAO.class); // 返回由MyBatis自动生成的指定接口的实现类
	}
	
	@Override
	public List<Product> queryAll() {
		List<Product> ps = productDAO.queryAll();
		session.close();
		return ps;
	}

	@Override
	public Product queryById(Serializable id) {
		Product p = productDAO.queryById(id);
		session.close();
		return p;
	}

	@Override
	public void add(Product t) {
		productDAO.add(t);
		session.commit();
		session.close();
	}

	@Override
	public void update(Product t) {
		productDAO.update(t);
		session.commit();
		session.close();
	}

	@Override
	public void deleteById(Serializable id) {
		productDAO.deleteById(id);
		session.commit();
		session.close();
	}

	@Override
	public void add1(String name, double price) {
		productDAO.add1(name, price);
		session.commit();
		session.close();
	}

	@Override
	public Pager4EasyUI<Product> queryByPagerAndCriteria(Pager4EasyUI<Product> pager, Product t) {
		List<Product> products = productDAO.queryByPagerAndCriteria(pager, t);
		pager.setRows(products);
		pager.setTotal(productDAO.countByCriteria(t));
		session.close();
		return pager;
	}

}
