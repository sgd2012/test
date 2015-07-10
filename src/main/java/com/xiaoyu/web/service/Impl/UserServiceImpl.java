package com.xiaoyu.web.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoyu.web.dao.UserDao;
import com.xiaoyu.web.po.Mybatis;
import com.xiaoyu.web.service.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	public List<Mybatis> getUserList() {
		List<Mybatis> list = userDao.getUserList();
		for (int i = 0; i < list.size(); i++) {
			Mybatis mybati = list.get(i);
			System.out.println(mybati.getId());
			System.out.println(mybati.getName());
		}
		return list;
	}

}
