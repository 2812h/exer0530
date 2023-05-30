package com.javasm.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog1 {
    @Value("小狗")
    private String name;
}
