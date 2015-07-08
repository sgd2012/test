package com.xiaoyu.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommonController {
	 /**
     * Ê×Ò³
     * 
     * @param request
     * @return
     */
    @RequestMapping("index")
    public String index(@RequestParam String name,@RequestParam String author) {
    	System.out.println(name + "---------" + author);
        return "index";
    }

}
