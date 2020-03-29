package com.dharohar.auth.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dharohar.auth.model.Tree;

public interface TreeRepository extends JpaRepository<Tree, Long>{
	
	Tree findByName(String name);
}
