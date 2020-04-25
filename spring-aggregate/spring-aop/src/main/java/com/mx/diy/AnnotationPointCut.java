package com.mx.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect // 标注这个类是一个切面
@Component
public class AnnotationPointCut {

    // 配置切入点和连接点
    @Before("execution(* com.mx.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("=====方法执行前=====");
    }

    @After("execution(* com.mx.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("=====方法执行后======");
    }
}
