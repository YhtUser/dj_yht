package com.dj.springboot;

import com.dj.springboot.domain.Student;
import com.dj.springboot.domain.Worker;
import com.dj.springboot.mapper.WorkerMapper;
import com.dj.springboot.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkerTest {

    @Autowired
    private WorkerMapper workerMapper;
    @Test
    public void findUserAll() {
        List<Worker> userAll = workerMapper.findUserAll();
        for (Worker user : userAll) {
            System.out.println(user.toString());
        }
    }

    //查询单条
    @Test
    public void findUserById() {
        Integer id = 2;
        Worker student = workerMapper.findUserById(id);
        System.out.println(student.toString());

    }

    //新增
    @Test
    public void insertUser() {

        Worker user = new Worker();
        user.setClassname("语文");

        workerMapper.insertUser(user);
        System.out.println(user.getId());
        List<Worker> userAll = workerMapper.findUserAll();
        for (Worker user1 : userAll) {
            System.out.println(user1.toString());
        }
    }


    //修改
    @Test
    public void updatePro() throws IOException {
        Worker user = new Worker();
        user.setId(2);
        user.setClassname("英语");

        workerMapper.updateUser(user);
        List<Worker> userAll = workerMapper.findUserAll();
        for (Worker user1 : userAll) {
            System.out.println(user1.toString());
        }
    }
    //删除
    @Test
    public void delPro(){

        Integer id = 3;
        workerMapper.deleteAll(id);
        List<Worker> userAll = workerMapper.findUserAll();
        for (Worker user : userAll) {
            System.out.println(user.toString());
        }

    }
}
