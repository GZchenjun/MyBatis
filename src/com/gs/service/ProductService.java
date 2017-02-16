package com.gs.service;

import com.gs.bean.Product;

public interface ProductService extends BaseService<Product> {

	public void add1(String name, double price);
	
}
