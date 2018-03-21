package com.dj.springboot.service;

import com.dj.springboot.domain.User;

import java.util.List;

public interface UserService {
    List<User> findUserAll();

    User findUserById(Integer id);

    void deleteAll(Integer id);



    void updateUser(User user);

    Integer insertUser(User user);
}
