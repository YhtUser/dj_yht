package com.dj.springboot.service;

import com.dj.springboot.domain.User;
import com.dj.springboot.domain.Worker;

import java.util.List;

public interface WorkerService {
    List<Worker> findUserAll();

    Worker findUserById(Integer id);

    void deleteAll(Integer id);

    void insertUser(Worker worker);

    void updateUser(Worker worker);
}
