package com.training.complete.init;

import com.training.complete.model.Role;
import com.training.complete.model.RoleName;
import com.training.complete.model.User;
import com.training.complete.service.RoleService;
import com.training.complete.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class InitDatabase implements CommandLineRunner {
    private RoleService roleService;
    private UserService userService;

    @Autowired
    public InitDatabase(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
        List<RoleName> roles = Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_USER);
        createRoles(roles);
        createUser();
    }

    void createRoles(List<RoleName> roleNames) {
        roleNames.forEach(roleName -> roleService.saveRole(new Role(roleName)));
    }

    void createUser() {
        User user = new User();
        user.setUsername("mohamed");
        user.setFirstname("mohamed");
        user.setLastname("bahrini");
        user.setEmail("email@gmail.com");
        user.setPassword("12345");
        user.setEnabled(true);
        user.setRoles(roleService.getAllRoles().stream().collect(Collectors.toSet()));

        userService.saveUser(user);
    }

}
