package com.dharohar.auth.service;

import com.dharohar.auth.model.Blog;
import com.dharohar.auth.model.Tree;

public interface BlogService {
    void save(Blog blog);

    Blog findByname(String name);
    
}
