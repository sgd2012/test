package com.xiaoyu.web.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xiaoyu.web.po.Mybatis;
import com.xiaoyu.web.service.UserService;

@Controller
public class CommonController {
	@Autowired
	private UserService userServiceImpl;
	 /**
     * Ê×Ò³
     * 
     * @param request
     * @return
     */
    @RequestMapping("index")
    public String index(@RequestParam String name,@RequestParam String author) {
    	System.out.println(name + "---------" + author);
    	List<Mybatis> list = userServiceImpl.getUserList();
        return "index";
    }

}
