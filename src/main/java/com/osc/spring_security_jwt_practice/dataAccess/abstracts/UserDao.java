package com.osc.spring_security_jwt_practice.dataAccess.abstracts;

import com.osc.spring_security_jwt_practice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

    User findByUsername(String username);

}
