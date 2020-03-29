package com.dharohar.auth.service;

import com.dharohar.auth.model.Tree;
import com.dharohar.auth.model.User;
import com.dharohar.auth.repository.TreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreeServiceImpl implements TreeService {
    @Autowired
    private TreeRepository treeRepository;
   
    @Autowired
    UserService userService;
    
    @Autowired
    SecurityService securityServices;
    
    @Override
    public void save(Tree tree) {
        tree.setName(tree.getName());
        tree.setLocation(tree.getLocation());
//        User user=userService.findByUsername(securityServices.findLoggedInUsername());
//        tree.setUser(user);
        treeRepository.save(tree);
    }

	@Override
	public Tree findByname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
