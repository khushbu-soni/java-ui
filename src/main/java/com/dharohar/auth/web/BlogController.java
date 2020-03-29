package com.dharohar.auth.web;

import com.dharohar.auth.model.Blog;
import com.dharohar.auth.model.Tree;
import com.dharohar.auth.model.User;
import com.dharohar.auth.service.BlogService;
import com.dharohar.auth.service.SecurityService;
import com.dharohar.auth.service.TreeService;
import com.dharohar.auth.service.UserService;
import com.dharohar.auth.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogController {
    @Autowired
    private TreeService blogService;

    

    @RequestMapping(value = "/blog", method = RequestMethod.GET)
    public String blog(Model model) {
        model.addAttribute("treeForm", new Blog());
        System.out.println("hI..........");
        return "blog";
    }
    
    @RequestMapping(value = "/blog", method = RequestMethod.POST)
    public String blog(@ModelAttribute("blogForm") Tree blogForm, BindingResult bindingResult, Model model) {

       

    	blogService.save(blogForm);

        return "redirect:/blog";
    }

}