package com.dj.springboot.controller;

import com.dj.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("findStudent")
    public String findStudent(Model model){
        model.addAttribute("studentList",studentService.findStudent());
        return "stu_list";
    }
}
