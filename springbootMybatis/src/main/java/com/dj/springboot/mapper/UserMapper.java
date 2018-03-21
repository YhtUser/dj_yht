package com.dj.springboot.mapper;


import com.dj.springboot.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface UserMapper {

    @Select("select * from user")
    List<User> findUserAll();

    @Select("select * from user where id = #{id}")
    User findUserById(Integer id);
    @Delete("delete from user where id = #{id}")
    void deleteAll(Integer id);

    @Insert("insert into user (username,password) values (#{username},#{password})")
    @SelectKey(before = false, keyProperty="id",resultType = Integer.class, statement = "SELECT LAST_INSERT_ID()")
    Integer insertUser(User user);

    @Update("update user set username = #{username}, password = #{password} where id = #{id}")
    void updateUser(User user);



}
