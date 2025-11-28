package com.lw.demo.service.impl;

import com.lw.demo.dao.UserRepository;
import com.lw.demo.entity.User;
import com.lw.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * user service implementation
 *
 * @author lw
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * user repository
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * add user
     * @param user
     */
    @Override
    public void addUser(User user){
        userRepository.save(user);
    }

    /**
     * find all user
     * @return user list
     */
    @Override
    public List<User> list() {
        return userRepository.findAll();
    }
}
