package com.mx.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 说明这个类被Spring接管了，注册到了容器中
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    // 属性注入值
    @Value("jesse")
    public void setName(String name) {
        this.name = name;
    }
}
