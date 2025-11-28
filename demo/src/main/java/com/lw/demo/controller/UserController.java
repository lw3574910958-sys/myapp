// src/main/java/com/lw/demo/controller/UserController.java
package com.lw.demo.controller;

import com.lw.demo.entity.User;
import com.lw.demo.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Tag(name = "用户管理", description = "用户相关的API")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    @Operation(summary = "添加用户", description = "添加一个新的用户")
    public User addUser(@RequestBody User user){
        userService.addUser(user);
        return user;
    }

    @GetMapping("/list")
    @Operation(summary = "获取用户列表", description = "获取所有用户的列表")
    public List<User> listUser(){
        return userService.list();
    }
}
