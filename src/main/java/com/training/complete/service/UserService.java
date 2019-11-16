package com.training.complete.service;

import com.training.complete.model.User;

import java.util.List;

public interface UserService {
    public void saveUser(User user);
    public List<User> getAllUsers();
}
