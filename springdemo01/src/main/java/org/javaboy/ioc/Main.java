package org.javaboy.ioc;

import org.javaboy.ioc.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");
//        m1(ctx);
//        m2(ctx);
//        m3(ctx);
//        m4(ctx);
        User u4 = ctx.getBean("user4", User.class);
        System.out.println("u4 = " + u4);

    }

    private static void m4(ClassPathXmlApplicationContext ctx) {
        User u3 = ctx.getBean("user3", User.class);
        System.out.println("u3 = " + u3);
    }

    private static void m3(ClassPathXmlApplicationContext ctx) {
        User user = ctx.getBean("user", User.class);
        user.setAddress("waaa");
        user.setUsername("ea");
        user.setId(1);
        System.out.println("user = " + user);
    }

    private static void m2(ClassPathXmlApplicationContext ctx) {
        User u2 = ctx.getBean("user2", User.class);
        System.out.println("u2 = " + u2);
    }

    private static void m1(ClassPathXmlApplicationContext ctx) {
        User u1 = (User) ctx.getBean("user");
        User u2 = ctx.getBean("user", User.class);
        User u3 = ctx.getBean(User.class);

        System.out.println("u1 = " + u1);
        System.out.println("u2 = " + u2);
        System.out.println("u3 = " + u3);
    }
}
