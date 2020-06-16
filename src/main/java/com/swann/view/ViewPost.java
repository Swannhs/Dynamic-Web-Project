package com.swann.view;

import com.swann.repository.UserPRepository;
import com.swann.userentity.UserPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewPost {
    @Autowired
    UserPRepository repository;

    @RequestMapping("/blogslist")
    public String viewPage(Model model) {
        Iterable<UserPost> array =  repository.findAll();
        for (UserPost posts : array){
            model.addAttribute("name",posts.getUser().getName());
            model.addAttribute("date", posts.getCreatedDate());
            model.addAttribute("title", posts.getTitle());
            model.addAttribute("post",posts.getPost());
            System.out.println(array);
        }
        return "blogslist";
    }
}