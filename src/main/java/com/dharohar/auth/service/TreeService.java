package com.dharohar.auth.service;

import com.dharohar.auth.model.Tree;
import com.dharohar.auth.model.User;

public interface TreeService {
    void save(Tree tree);

    Tree findByname(String name);
    
}
