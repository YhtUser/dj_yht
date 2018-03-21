package com.dj.springboot.service;

import com.dj.springboot.domain.User;
import com.dj.springboot.domain.Worker;
import com.dj.springboot.mapper.UserMapper;
import com.dj.springboot.mapper.WorkerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService{
    @Autowired
    private WorkerMapper workerMapper;

    @Override
    public List<Worker> findUserAll() {
        return workerMapper.findUserAll();
    }

    @Override
    public Worker findUserById(Integer id) {
        return workerMapper.findUserById(id);
    }

    @Override
    public void deleteAll(Integer id) {
        workerMapper.deleteAll(id);
    }

    @Override
    public void insertUser(Worker worker) {
        workerMapper.insertUser(worker);
    }

    @Override
    public void updateUser(Worker worker) {
        workerMapper.updateUser(worker);
    }

}
