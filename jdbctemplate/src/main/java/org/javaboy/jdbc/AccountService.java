package org.javaboy.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional//写在方法上代表这个方法有事务，写在类上表示类中的所有方法都有事务
    public void tr() {
        jdbcTemplate.update("update info set password=password-5 where name =?","n1");
        int i = 1 / 0;
        jdbcTemplate.update("update info set password=password+5 where name =?","n2");

    }
}
