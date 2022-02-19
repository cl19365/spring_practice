package org.javaboy.ioc;

import org.springframework.context.annotation.*;
//条件注解

@Configuration
public class JavaConfig {
    @Bean("cmd")
    @Conditional(WindosCondition.class)//若为真则执行
    ShowCmd winCmd(){
        return new WindosShowCmd();
    }

    @Bean("cmd")
    @Conditional(LinuxCondition.class)//若为真则执行
    ShowCmd linuxCmd(){
        return new LinuxShowCmd();
    }

    @Bean
    @Profile("dev")
    @Scope("prototype")//加入之后每次获取将不再是同一个 不再是单例
    DataSource devDs(){
        DataSource ds = new DataSource();
        ds.setUrl("jdbc:mysql:///vhr");
        ds.setUsername("root");
        ds.setPassword("123");
        return ds;
    }

    @Bean
    @Profile("prod")
    @Scope("prototype")
    DataSource prodDs(){
        DataSource ds = new DataSource();
        ds.setUrl("jdbc:mysql://192.168.63.56:3306/vhr");
        ds.setUsername("root");
        ds.setPassword("456");
        return ds;
    }
}
