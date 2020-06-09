package com.swann.RLcontroller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.context.request.WebRequest;

import com.swann.repository.UserRepository;
import com.swann.userentity.User;

@Controller
public class Login {
	@Autowired
	private UserRepository repository;

	@RequestMapping("/cheaklogin")
	public String login(WebRequest request, Model model) {
		try {
			User obj = repository.findByName(request.getParameter("username"));
			System.out.println(obj);
			if (obj.getPassword().equals(request.getParameter("password"))) {
				model.addAttribute("username", request.getParameter("username"));
				return "/post";
			} else {
				return "redirect:/login";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:/login";
		}
	}
}
