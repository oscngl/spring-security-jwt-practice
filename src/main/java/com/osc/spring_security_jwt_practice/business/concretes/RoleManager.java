package com.osc.spring_security_jwt_practice.business.concretes;

import com.osc.spring_security_jwt_practice.business.abstracts.RoleService;
import com.osc.spring_security_jwt_practice.dataAccess.abstracts.RoleDao;
import com.osc.spring_security_jwt_practice.dataAccess.abstracts.UserDao;
import com.osc.spring_security_jwt_practice.entities.Role;
import com.osc.spring_security_jwt_practice.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class RoleManager implements RoleService {

    private final RoleDao roleDao;
    private final UserDao userDao;

    @Override
    public Role saveRole(Role role) {
        return roleDao.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        User user = userDao.findByUsername(username);
        Role role = roleDao.findByName(roleName);
        user.getRoles().add(role);
    }

}
