package com.spring.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/hello")
	public String hello()
	{
		System.out.println("running");
		return "index";
	}

}
