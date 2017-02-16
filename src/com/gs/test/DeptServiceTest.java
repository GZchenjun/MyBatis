package com.gs.test;

import java.util.List;

import org.junit.Test;

import com.gs.bean.Dept;
import com.gs.bean.Emp;
import com.gs.service.DeptService;
import com.gs.service.DeptServiceImpl;

import junit.framework.TestCase;

public class DeptServiceTest extends TestCase {
	
	private DeptService ds;

	@Override
	protected void setUp() throws Exception {
		ds = new DeptServiceImpl();
	}
	
	@Test
	public void testQueryAll() {
		List<Dept> depts = ds.queryAll();
		for (Dept d : depts) {
			System.out.println(d.getName());
			List<Emp> emps = d.getEmps();
			for (Emp e : emps) {
				System.out.println(e.getName());
			}
		}
	}

}
