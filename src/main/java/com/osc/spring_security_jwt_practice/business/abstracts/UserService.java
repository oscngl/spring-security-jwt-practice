package com.osc.spring_security_jwt_practice.business.abstracts;

import com.osc.spring_security_jwt_practice.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    User getUser(String username);
    List<User> getUsers();

}
