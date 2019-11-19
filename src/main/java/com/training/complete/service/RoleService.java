package com.training.complete.service;

import com.training.complete.model.Role;
import com.training.complete.model.RoleName;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    Role saveRole(Role role);

    List<Role> getAllRoles();

    Optional<Role> getRoleByName(RoleName roleUser);
}
