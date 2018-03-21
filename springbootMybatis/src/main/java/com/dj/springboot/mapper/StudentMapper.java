package com.dj.springboot.mapper;


import com.dj.springboot.domain.Student;
import com.dj.springboot.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface StudentMapper {


    List<Student> findStudent();


    Student findUserById(Integer id);

    void deleteAll(Integer id);



    void insertUser(Student student);


    void updateUser(Student student);



}
