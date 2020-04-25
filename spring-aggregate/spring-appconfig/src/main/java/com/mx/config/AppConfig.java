package com.mx.config;

import com.mx.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 这个也会被Spring容器托管，注册到容器中
// 本质上是一个@Component，@Configuration代表这个是配置类，和beans.xml起的作用是一致的
@Configuration
@ComponentScan("com.mx.pojo")
public class AppConfig {

    // 注册一个Bean，相当于xml中的bean标签
    // 方法的名字，相当于bean标签中的id属性
    // 方法的返回值，相当于bean标签的class属性
    @Bean
    public User getUser(){
        return new User();  // 返回注入的bean
    }
}
