package com.dj.springboot;

import com.dj.springboot.domain.User;
import com.dj.springboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserService userService;
    @Test
    public void findUserAll() {
        List<User> userAll = userService.findUserAll();
        for (User user : userAll) {
            System.out.println(user.toString());
        }
    }

    //查询单条
    @Test
    public void findUserById() {
        Integer id = 2;
       User user = userService.findUserById(id);
        System.out.println(user.toString());

    }

    //新增
    @Test
    public void insertUser() {

        User user = new User();
        user.setUsername("xiaopang");
        user.setPassword("123456");
        userService.insertUser(user);
        System.out.println(user.getId());
        List<User> userAll = userService.findUserAll();
        for (User user1 : userAll) {
            System.out.println(user1.toString());
        }
    }


    //修改
    @Test
    public void updatePro() throws IOException {
        User user = new User();
        user.setId(2);
        user.setUsername("xiaohua");
        user.setPassword("123456");
        userService.updateUser(user);
        List<User> userAll = userService.findUserAll();
        for (User user1 : userAll) {
            System.out.println(user1.toString());
        }
    }
    //删除
    @Test
    public void delPro() throws IOException {

        Integer id = 3;
        userService.deleteAll(id);
        List<User> userAll = userService.findUserAll();
        for (User user : userAll) {
            System.out.println(user.toString());
        }

    }
}
