package org.javaboy.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        m1();
//        m2();
//        m3();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig2.class);
        DataSource ds = ctx.getBean("ds", DataSource.class);
        System.out.println("ds = " + ds);
    }

    private static void m3() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles("prod");
        ctx.setConfigLocation("applicationContext.xml");
        ctx.refresh();
//        DataSource ds = ctx.getBean(DataSource.class);
//        DataSource ds1 = ctx.getBean(DataSource.class);
//        System.out.println(ds == ds1);
        DataSource ds3 = ctx.getBean("ds", DataSource.class);
        System.out.println("ds3 = " + ds3);
    }

    private static void m2() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("dev");
        ctx.register(JavaConfig.class);
        ctx.refresh();
        DataSource ds = ctx.getBean(DataSource.class);
        DataSource ds2 = ctx.getBean(DataSource.class);
        System.out.println(ds == ds2);
//        System.out.println("ds = " + ds);
    }

    private static void m1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        ShowCmd cmd = (ShowCmd) ctx.getBean("cmd");
        String s = cmd.showCmd();
        System.out.println("s = " + s);
    }
}
