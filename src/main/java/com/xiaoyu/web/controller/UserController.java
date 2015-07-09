package com.xiaoyu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("user")
public class UserController {
	
	@RequestMapping("getUserList")
	public String getUserList(){
		return "userList";
	}
}
