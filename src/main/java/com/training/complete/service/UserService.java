package com.training.complete.service;

import com.training.complete.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUsers();

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    List<User> findUsers(String search);
}
