package com.javasm.entity;

public class Game {
    private String name;

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
