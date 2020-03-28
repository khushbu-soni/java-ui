package com.dharohar.auth.repository;

import com.dharohar.auth.model.Role;
import com.dharohar.auth.model.Tree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreeRepository extends JpaRepository<Tree, Long>{
}
