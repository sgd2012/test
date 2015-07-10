package com.xiaoyu.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.xiaoyu.web.po.Mybatis;

@Repository("userDao")
public interface UserDao {
	
	@Select("select * from mybatis ")
	public List<Mybatis> getUserList();
}
