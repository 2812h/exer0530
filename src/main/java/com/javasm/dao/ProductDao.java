package com.javasm.dao;

public class ProductDao {
    public ProductDao() {
        System.out.println("无参构造");
    }

    public void init() {
        System.out.println("连接数据库...");
    }

    public void addProduct() {
        System.out.println("添加一个产品...");
    }
    public void updateProduct(){
        System.out.println("更新一条产品信息...");
    }
    public void destroy(){
        System.out.println("断开数据库链接...");
    }
}
