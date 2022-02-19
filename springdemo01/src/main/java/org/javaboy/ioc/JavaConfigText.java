package org.javaboy.ioc;

import org.javaboy.ioc.javaconfig.JavaConfig;
import org.javaboy.ioc.javaconfig.SayHello;
import org.javaboy.ioc.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class JavaConfigText {
    public static void main(String[] args) {
        //加载Java配置类
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        SayHello sayHello = ctx.getBean("sayHello", SayHello.class);
        System.out.println(sayHello.sayHello("eizo"));
        UserService userService = ctx.getBean(UserService.class);
        List<String> allUsers = userService.getAllUsers();
        System.out.println("allUsers = " + allUsers);
    }
}
