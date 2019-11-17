package com.training.complete.service;

import com.training.complete.model.Role;

import java.util.List;

public interface RoleService {
    public Role saveRole(Role role);

    public List<Role> getAllRoles();
}
