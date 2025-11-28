package com.lw.demo.entity;

import jakarta.persistence.*;

/**
 * User entity
 *
 * @author lw
 */
@Entity
@Table(name = "tb_user")
public class User {

    /**
     * User ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer userId;

    /**
     * User name
     */
    private String userName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
