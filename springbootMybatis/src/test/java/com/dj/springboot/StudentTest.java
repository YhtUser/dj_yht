package com.dj.springboot;

import com.dj.springboot.domain.Student;
import com.dj.springboot.domain.User;
import com.dj.springboot.service.StudentService;
import com.dj.springboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest {
    @Autowired
    private StudentService studentService;
    @Test
    public void findUserAll() {
        List<Student> userAll = studentService.findStudent();
        for (Student user : userAll) {
            System.out.println(user.toString());
        }
    }

    //查询单条
    @Test
    public void findUserById() {
        Integer id = 2;
        Student student = studentService.findUserById(id);
        System.out.println(student.toString());

    }

    //新增
    @Test
    public void insertUser() {

        Student user = new Student();
        user.setName("xiaopang");
        user.setAge(20);
        studentService.insertUser(user);
        System.out.println(user.getId());
        List<Student> userAll = studentService.findStudent();
        for (Student user1 : userAll) {
            System.out.println(user1.toString());
        }
    }


    //修改
    @Test
    public void updatePro() throws IOException {
        Student user = new Student();
        user.setId(2);
        user.setName("xiaohua");
        user.setAge(20);
        studentService.updateUser(user);
        List<Student> userAll = studentService.findStudent();
        for (Student user1 : userAll) {
            System.out.println(user1.toString());
        }
    }
    //删除
    @Test
    public void delPro(){

        Integer id = 3;
        studentService.deleteAll(id);
        List<Student> userAll = studentService.findStudent();
        for (Student user : userAll) {
            System.out.println(user.toString());
        }

    }
}
