package com.training.complete.controller;

import com.training.complete.model.User;
import com.training.complete.repository.UserRepository;
import com.training.complete.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/create")
    public void createUser() {
        User user = new User();
        user.setEmail("email@gmail.com");
        userService.saveUser(user);
    }
}
