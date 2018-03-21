package com.dj.springboot.service;

import com.dj.springboot.domain.User;
import com.dj.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUserAll() {
        return userMapper.findUserAll();
    }

    @Override
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    public void deleteAll(Integer id) {
        userMapper.deleteAll(id);
    }




    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public Integer insertUser(User user) {
        userMapper.insertUser(user);
        Integer id = user.getId();
        return id;
    }

}
