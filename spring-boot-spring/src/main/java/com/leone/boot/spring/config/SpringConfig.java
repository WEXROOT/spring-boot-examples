package com.leone.boot.spring.config;

import com.leone.boot.spring.beans.Student;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author leone
 * @since 2018-07-01
 **/
@Configuration
public class SpringConfig implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Bean
    public Student student() {
        System.out.println("Java config init");
        return new Student();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }


}
