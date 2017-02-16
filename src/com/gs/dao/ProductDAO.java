package com.gs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gs.bean.Product;
import com.gs.common.bean.Pager4EasyUI;

public interface ProductDAO extends BaseDAO<Product> {
	
	public void add1(@Param("name") String name, @Param("price") double price);
	
	public List<Product> queryByPagerAndCriteria(@Param("pager")Pager4EasyUI<Product> pager, @Param("product")Product t);
	
	public int countByCriteria(Product t);

}
