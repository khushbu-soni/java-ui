package com.dharohar.auth.repository;

import com.dharohar.auth.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long>{
}
