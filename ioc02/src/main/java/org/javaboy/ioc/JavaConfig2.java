package org.javaboy.ioc;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
//混合配置
@Configuration
@ImportResource("classpath:applicationText.xml")
public class JavaConfig2 {
}
