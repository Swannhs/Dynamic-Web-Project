package com.swann.RLcontroller;

import com.swann.repository.UserDRepository;
import com.swann.repository.UserRepository;
import com.swann.userentity.User;
import com.swann.userentity.UserDetials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class Registration {
	@Autowired
    UserRepository repository;

	@Autowired
    UserDRepository dRepository;

	@RequestMapping("/adduser")
	public String signup(WebRequest request) {
        UserDetials detials = new UserDetials(
                request.getParameter("username"),
                request.getParameter("fname"),
                request.getParameter("lname"),
                request.getParameter("email"),
                request.getParameter("address"),
                request.getParameter("company"),
                request.getParameter("phone"));
        User user = new User(
                request.getParameter("username"),
                request.getParameter("password"));
        repository.save(user);
        dRepository.save(detials);
        return "redirect:/index";
	}
}
