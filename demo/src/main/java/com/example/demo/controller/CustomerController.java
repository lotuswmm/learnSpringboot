package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * controller 负责页面访问控制
 * 
 * @RestController
 * Controller 里面的方法都以 json 格式输出
 */
@RestController
public class CustomerController {
	@RequestMapping("/hello")
	public String index() {
		return "hello world";
	}
}
