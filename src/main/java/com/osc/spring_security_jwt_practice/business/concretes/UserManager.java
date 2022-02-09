package com.osc.spring_security_jwt_practice.business.concretes;

import com.osc.spring_security_jwt_practice.business.abstracts.UserService;
import com.osc.spring_security_jwt_practice.dataAccess.abstracts.UserDao;
import com.osc.spring_security_jwt_practice.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserManager implements UserService {

    private final UserDao userDao;

    @Override
    public User saveUser(User user) {
        return userDao.save(user);
    }

    @Override
    public User getUser(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        return userDao.findAll();
    }

}
