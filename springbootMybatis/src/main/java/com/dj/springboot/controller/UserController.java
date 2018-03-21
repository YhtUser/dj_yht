package com.dj.springboot.controller;

import com.dj.springboot.domain.User;
import com.dj.springboot.service.StudentService;
import com.dj.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;



    @RequestMapping("findUserAll")
    public String findUserAll(Model model){
        model.addAttribute("userList",userService.findUserAll());
        return "user_list";
    }

    @RequestMapping("findUserById")
    @ResponseBody
    public User findUserById(Integer id){

        User user= userService.findUserById(id);
        return user;
    }

    @RequestMapping("deleteAll")
    @ResponseBody
    public String deleteAll(Integer id){

        userService.deleteAll(id);
        return "success";
    }

    @RequestMapping("insertUser")
    @ResponseBody
    public Integer insertUser(User user){

       userService.insertUser(user);
       Integer id = user.getId();
        return id;
    }

    @RequestMapping("updateUser")
    @ResponseBody
    public String updateUser(User user){

        userService.updateUser(user);
        return "success";
    }

    @RequestMapping("getMsg")
    @ResponseBody
    public String getMsg(@RequestBody User user){

        return "success";
    }
}
