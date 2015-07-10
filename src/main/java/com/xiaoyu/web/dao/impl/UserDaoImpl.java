package com.xiaoyu.web.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xiaoyu.web.dao.UserDao;
import com.xiaoyu.web.po.Mybatis;

public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	public List<Mybatis> getUserList() {
		List<Mybatis> list = new ArrayList<Mybatis>();
//		List<Mybatis> list = sqlSessionFactory.openSession().selectList("authentication");
//		for (int i = 0; i < list.size(); i++) {
//			Mybatis mybati = list.get(i);
//			System.out.println(mybati.getId());
//			System.out.println(mybati.getName());
//		}
		return list;
	}

}
