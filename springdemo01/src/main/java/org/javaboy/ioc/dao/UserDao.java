package org.javaboy.ioc.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public String hello(){
        return "hello";
    }
}
