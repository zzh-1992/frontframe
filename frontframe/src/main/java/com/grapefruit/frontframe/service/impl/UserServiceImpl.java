package com.grapefruit.frontframe.service.impl;

import com.grapefruit.frontframe.dao.UserDao;
import com.grapefruit.frontframe.entity.User;
import com.grapefruit.frontframe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User queryById(Integer id) {
        return null;
    }

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }
}
