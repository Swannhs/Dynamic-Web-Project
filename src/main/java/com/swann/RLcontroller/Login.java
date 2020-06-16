package com.swann.RLcontroller;

import com.swann.repository.UserDRepository;
import com.swann.userentity.UserDetials;
import com.swann.userentity.UserPost;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.swann.repository.UserRepository;
import com.swann.userentity.User;

@RestController
@RequestMapping("/cheaklogin")
public class Login {
	@Autowired
	private UserRepository repository;

	@Autowired
	private UserDRepository dRepository;

	@RequestMapping("/")
	public String login(WebRequest request, Model model) {
		try {
			User obj = repository.findByName(request.getParameter("username"));
			if (obj.getPassword().equals(request.getParameter("password"))) {
				UserDetials upost = dRepository.findByUser(obj.getName());
				model.addAttribute("fname", upost.getFname());
				model.addAttribute("lname", upost.getLname());
				model.addAttribute("email", upost.getEmail());
				model.addAttribute("company", upost.getCompany());
				model.addAttribute("phone", upost.getPhone());
				model.addAttribute("address", upost.getAddress());
				model.addAttribute("username", request.getParameter("username"));
				return "profile";
			} else {
				return "redirect:/login";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:/login";
		}
	}
}
