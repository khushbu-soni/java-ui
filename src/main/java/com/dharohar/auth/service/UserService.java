package com.dharohar.auth.service;

import com.dharohar.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
