package com.dj.springboot.mapper;

import com.dj.springboot.domain.Student;
import com.dj.springboot.domain.Worker;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

public interface WorkerMapper {

    @SelectProvider(type = WorkerMapperSQL.class,method = "findUserAll")
    List<Worker> findUserAll();

    @SelectProvider(type = WorkerMapperSQL.class,method = "findUserById")
    Worker findUserById(Integer id);
    @DeleteProvider(type = WorkerMapperSQL.class,method = "deleteAll")
    void deleteAll(Integer id);


    @InsertProvider(type = WorkerMapperSQL.class,method = "insertUser")
    void insertUser(Worker worker);

    @UpdateProvider(type = WorkerMapperSQL.class,method = "updateUser")
    void updateUser(Worker worker);
}
