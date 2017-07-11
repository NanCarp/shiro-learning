package com.github.nancarp.shiro.chapter6.service;

import com.github.nancarp.shiro.chapter6.Entity.User;
import com.github.nancarp.shiro.chapter6.dao.UserDao;
import com.github.nancarp.shiro.chapter6.dao.UserDaoImpl;

import java.util.Set;

/**
 * Created by NanCarp on 2017/7/11.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    private PasswordHelper passwordHelper = new PasswordHelper();

    public User createUser(User user) {
        passwordHelper.encryptPassword(user);
        return null;
    }

    public void changePassword(Long userId, String newPassword) {

    }

    public void correlationRoles(Long userId, Long... roleIds) {

    }

    public void uncorrelationRoles(Long userId, Long... roleIds) {

    }

    public User findByUsername(String username) {
        return null;
    }

    public Set<String> findRoles(String username) {
        return null;
    }

    public Set<String> findPermissions(String username) {
        return null;
    }
}
