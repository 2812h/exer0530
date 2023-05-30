package com.javasm.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@PropertySource("classpath:data.properties")
public class Student {
    @Value("${id}")
    private int id;
    @Value("${name}")
    private String name;
    @Autowired //先BuType再ByName
//    @Resource 先byName再BuType
    private Cat1 cat1;
    @Autowired
    private Dog1 dog1;
 //    private Game game;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cat1=" + cat1 +
                ", dog1=" + dog1 +
                '}';
    }


//    public Student(int id, String name, Game game) {
//        this.id = id;
//        this.name = name;
//        this.game = game;
//    }

//    public Game getGame() {
//        return game;
//    }

//    public void setGame(Game game) {
//        this.game = game;
//    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }


}
