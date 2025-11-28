package com.lw.demo.service;

import com.lw.demo.entity.User;

import java.util.List;

/**
 * Description: UserService
 * @author lw
 */
public interface UserService {

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 所有用户列表
     * @return list
     */
    List<User> list();
}
