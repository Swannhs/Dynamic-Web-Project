package com.swann.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/index")
	public String index(){
		return "index";
	}

	@RequestMapping("/about")
	public String about(){
		return "about";
	}

	@RequestMapping("/login")
	public String login(){
		return "login";
	}

	@RequestMapping("/signup")
	public String registration(){
		return "registration";
	}
	@RequestMapping("/profile")
	public String profile(){
		return "profile";
	}
	@RequestMapping("/post")
	public String post(){
		return "post";
	}
}
