package com.javasm.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat1 {
    @Value("小猫")
    private String name;
}
