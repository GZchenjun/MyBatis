package com.gs.test;

import java.util.List;

import org.junit.Test;

import com.gs.bean.Emp;
import com.gs.service.EmpService;
import com.gs.service.EmpServiceImpl;

import junit.framework.TestCase;

public class EmpServiceTest extends TestCase {
	
	private EmpService es;

	@Override
	protected void setUp() throws Exception {
		es = new EmpServiceImpl();
	}
	
	@Test
	public void testQueryAll() {
		List<Emp> emps = es.queryAll();
		for (Emp e : emps) {
			System.out.println(e.getName() + e.getDept().getName() + e.getDept().getId());
		}
	}

}
