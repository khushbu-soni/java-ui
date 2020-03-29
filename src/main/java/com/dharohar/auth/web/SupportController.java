package com.dharohar.auth.web;

import com.dharohar.auth.model.Tree;
import com.dharohar.auth.model.User;
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
public class SupportController {
    @Autowired
    private TreeService treeService;

    

    @RequestMapping(value = "/support", method = RequestMethod.GET)
    public String support(Model model) {
        model.addAttribute("treeForm", new Tree());
        System.out.println("hI..........");
        return "support";
    }
    
    @RequestMapping(value = "/support", method = RequestMethod.POST)
    public String support(@ModelAttribute("treeForm") Tree treeForm, BindingResult bindingResult, Model model) {

       

        treeService.save(treeForm);

        return "redirect:/support";
    }

}