package com.dj.springboot.service;

import com.dj.springboot.domain.Student;
import com.dj.springboot.domain.User;

import java.util.List;

public interface StudentService {
    List<Student> findStudent();

    Student findUserById(Integer id);

    void deleteAll(Integer id);

    void insertUser(Student student);

    void updateUser(Student student);
}
