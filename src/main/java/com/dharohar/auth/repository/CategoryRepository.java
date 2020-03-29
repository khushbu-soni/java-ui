package com.dharohar.auth.repository;

import com.dharohar.auth.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
