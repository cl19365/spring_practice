package org.javaboy.jdbc;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcTest {
    JdbcTemplate jdbcTemplate;
    private AccountService accountService;

    @Before
    public void before(){
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        jdbcTemplate=ctx.getBean(JdbcTemplate.class);
        accountService = ctx.getBean(AccountService.class);
    }

    @Test
    public void test1(){
        jdbcTemplate.update("insert into info (id,name,password)value (?,?,?);","3","n3","146");

    }

    @Test
    public void test2(){
        jdbcTemplate.update("update info set name=? where id=?;","n33","3");
    }

    @Test
    public void test3(){
        jdbcTemplate.update("delete from info where id=3");
    }

    @Test
    public void test4(){
        List<User> list = jdbcTemplate.query("select * from info", new BeanPropertyRowMapper<User>(User.class));
        System.out.println("list = " + list);
    }

    @Test
    public void test5(){
        accountService.tr();

    }
}
