package com.dj.springboot.mapper;

import com.dj.springboot.domain.Worker;

public class WorkerMapperSQL {


    public String findUserAll(){

        return "select * from worker";
    }
    public String findUserById(Integer id){

        return "select * from worker where id = " + id;
    }
    public String deleteAll(Integer id){
        return "DELETE FROM worker WHERE id = " + id;
    }

    public String insertUser(Worker worker){
        return "insert into worker (classname) values (#{classname})";

    }
    public String updateUser(Worker worker){
        return "update worker set classname = #{classname} where id = " + worker.getId();
    }






}
