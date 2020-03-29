package com.dharohar.auth.web;

import com.dharohar.auth.model.Tree;
import com.dharohar.auth.model.User;
import com.dharohar.auth.repository.UserRepository;
import com.dharohar.auth.service.SecurityService;
import com.dharohar.auth.service.TreeService;
import com.dharohar.auth.service.UserService;
import com.dharohar.auth.service.UserServiceImpl;
import com.dharohar.auth.validator.UserValidator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TreeController {
    @Autowired
    private TreeService treeService;
    @Autowired
    private UserService userService;
    @Autowired
    UserRepository userRepo;

    @RequestMapping(value = "/plantations", method = RequestMethod.GET)
    public String plantation(Model model) {
        
    	model.addAttribute("treeForm", new User());
//    		userService= new UserServiceImpl();
//    	  List<User> listCustomer = userService.listAll();
//    	    ModelAndView mav = new ModelAndView("index");
//    	    mav.addObject("userList", listCustomer);
    	
    	
        System.out.println("hI..........");
        
        return "plantations";
    }
    
    @RequestMapping(value = "/plantations", method = RequestMethod.POST)
    public String plantation(@ModelAttribute("treeForm") Tree treeForm, BindingResult bindingResult, Model model) {

       

        treeService.save(treeForm);

        return "redirect:/plantations";
    }
    
    @RequestMapping(value = "/plantationdetails", method = RequestMethod.GET)
    public String plantationDetails(Model model) {
    	
    	model.addAttribute("treeForm", new Tree());
        System.out.println("hI..........");
        return "plantationdetails";
        
    }

}