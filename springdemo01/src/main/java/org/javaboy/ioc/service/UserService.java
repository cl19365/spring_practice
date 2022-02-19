package org.javaboy.ioc.service;

import org.javaboy.ioc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public List<String> getAllUsers(){
        String hello= userDao.hello();
        System.out.println("hello = " + hello);
        List<String> users = new ArrayList<>();
        for (int i=0;i<10;i++){
            users.add("用户"+i);
        }
        return users;
    }
}
