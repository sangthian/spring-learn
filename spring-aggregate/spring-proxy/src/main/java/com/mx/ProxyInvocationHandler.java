package com.mx;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 使用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口类
    private Object target;

    // setter方法传值
    public void setTarget(Object target) {
        this.target = target;
    }

    // 通过Proxy的静态方法，生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    // 实现InvocationHandler接口的唯一方法
    // 处理代理实例的方法，并返回结果
    // proxy参数看起来并未使用，其作用不是显式的，看资料说，只有proxy实例在InvocationHandler实现类里加载才能产生第二个参数method
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        log(method.getName());
        return method.invoke(target, args);
    }

    // 增加的操作
    public void log(String msg){
        System.out.println("before " + msg);
    }
}
