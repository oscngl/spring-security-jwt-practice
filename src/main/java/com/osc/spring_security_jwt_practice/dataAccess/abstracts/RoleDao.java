package com.osc.spring_security_jwt_practice.dataAccess.abstracts;

import com.osc.spring_security_jwt_practice.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Integer> {

    Role findByName(String name);

}
