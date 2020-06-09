package com.swann.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.swann.repository.UserPRepository;
import com.swann.repository.UserRepository;
import com.swann.userentity.User;
import com.swann.userentity.UserPost;

@Controller
public class AddPost {
	@Autowired
	private UserPRepository repository;

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/addpost")
	public String view(WebRequest request, Model model, RedirectAttributes redirectAttributes) {
		User user = userRepository.findByName(request.getParameter("user"));
		UserPost post = new UserPost(user, request.getParameter("title"), request.getParameter("content"));
		System.out.println(post);
		repository.save(post);
		return "redirect:/index";
	}

}
