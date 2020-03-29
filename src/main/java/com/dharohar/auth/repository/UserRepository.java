package com.dharohar.auth.repository;

import com.dharohar.auth.model.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
    User findByUsername(String username);
    
}
