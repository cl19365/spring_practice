package org.javaboy.ioc.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//java配置
@Configuration//表示这是一个Java配置类
@ComponentScan(basePackages = "org.javaboy.ioc")//扫描指定包的类中含有以下四种注解的类进行自动注入，不添加参数则在当前类所在包及其子包中扫描对应的注解
//                                                      @Service（Service层）
//                                                      @Repository（Dao层）
//                                                      @Controller（Controller层）
//                                                      @Component（其他组件添加此注解）


//                                   只扫描指定包内类的指定注解
//(value = "org.javaboy.ioc.service",useDefaultFilters = false,includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Service.class)})
public class JavaConfig {
    @Bean
    SayHello sayHello(){
        return new SayHello();
    }
}
