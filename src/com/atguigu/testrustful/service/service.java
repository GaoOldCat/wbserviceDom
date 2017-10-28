package com.atguigu.testrustful.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service")
public class service {

	
/*	@RequestMapping("serv")
	public */
	
	
	@RequestMapping("/index")
	public String index(){
		System.out.println("1111");
		return "index";
	}
	
}
