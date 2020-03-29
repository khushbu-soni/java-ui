package com.dharohar.auth.service;

import com.dharohar.auth.model.User;
import com.dharohar.auth.repository.RoleRepository;
import com.dharohar.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

import javax.annotation.PostConstruct;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.saveAndFlush(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    @PostConstruct
    @Override
    public List<User> listAll() {
    		User user=new User();
    		
            return (List<User>) userRepository.findAll();
    }
}
