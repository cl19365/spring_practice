package org.javaboy.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
@PropertySource(value = "javaboy.properties")
public class AwareService implements BeanNameAware, BeanFactoryAware, ResourceLoaderAware, EnvironmentAware {

    private String beanName;
    private ResourceLoader resourceLoader;
    private Environment environment;

    /**
     * 获取Bean的生成工厂
     *
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    public void output() throws IOException {
        System.out.println("beanName = " + beanName);
        Resource resource = resourceLoader.getResource("javaboy.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream()));
        String s = br.readLine();
        System.out.println("s = " + s);
        br.close();
        String address = environment.getProperty("javaboy.address");
        System.out.println("address = " + address);
    }

    /**
     * 获取Bean的名称
     *
     * @param s
     */
    @Override
    public void setBeanName(String s) {
        this.beanName = s;

    }

    /**
     * 获取环境信息
     * @param environment
     */
    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;

    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader=resourceLoader;

    }
}
