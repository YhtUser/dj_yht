package com.dj.springboot.service;

import com.dj.springboot.domain.Student;
import com.dj.springboot.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findStudent() {
        return studentMapper.findStudent();
    }

    @Override
    public Student findUserById(Integer id) {
        return studentMapper.findUserById(id);
    }


    @Override
    public void deleteAll(Integer id) {
        studentMapper.deleteAll(id);
    }

    @Override
    public void insertUser(Student student) {
        studentMapper.insertUser(student);
    }

    @Override
    public void updateUser(Student student) {
        studentMapper.updateUser(student);
    }

}
