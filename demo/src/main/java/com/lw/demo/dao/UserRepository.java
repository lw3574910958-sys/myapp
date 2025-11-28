package com.lw.demo.dao;

import com.lw.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author lw
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer>{}
