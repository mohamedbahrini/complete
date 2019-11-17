package com.training.complete.service;

import com.training.complete.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);

    public List<User> getAllUsers();
}
