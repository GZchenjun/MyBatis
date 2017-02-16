package com.gs.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.gs.bean.User;

public class MyBatisTest {
	
	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		List<User> users = session.selectList("com.gs.bean.User.queryUser");
		for (User u : users) {
			System.out.println(u);
		}
		
		User user = session.selectOne("com.gs.bean.User1.queryUserById", 2);
		System.out.println(user);
		
		User u = new User();
		u.setId(3);
		u.setName("ccc");
		u.setPwd("ccc");
		session.insert("com.gs.bean.User.addUser", u);
		session.commit();
	}

}
