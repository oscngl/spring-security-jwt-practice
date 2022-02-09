package com.osc.spring_security_jwt_practice.business.abstracts;

import com.osc.spring_security_jwt_practice.entities.Role;

public interface RoleService {

    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);

}
