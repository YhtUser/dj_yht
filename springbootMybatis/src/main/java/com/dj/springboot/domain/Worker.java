package com.dj.springboot.domain;

public class Worker {
    private Integer id;
    private String classname;


    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", classname='" + classname + '\'' +
                '}';
    }
}
