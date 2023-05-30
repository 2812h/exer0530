package com.javasm.demo;

import com.javasm.dao.ProductDao;
import com.javasm.entity.Hero;
import com.javasm.entity.Person;
import com.javasm.entity.Student;
import com.javasm.factory.CalendarStaticFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class Demo1 {
    public static void main(String[] args) {
        test8();
    }

    /**
     * 构造方法注入
     */
    private static void test8() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = applicationContext.getBean(Student.class);
        System.out.println(student);
    }

    /**
     * 注入
     */
    private static void test6() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hero hero = applicationContext.getBean(Hero.class);
        System.out.println(hero);
    }

    /**
     * 初始化和销毁
     */
    private static void test5() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductDao productDao = applicationContext.getBean(ProductDao.class);
        productDao.addProduct();
        applicationContext.close();
    }

    /**
     * 内置工厂
     */
    private static void springFactory() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Calendar springFactory = (Calendar) applicationContext.getBean("SpringFactory");
        System.out.println(springFactory);
    }

    /**
     * 实例工厂
     */
    private static void text3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Calendar instanceFactory = (Calendar) applicationContext.getBean("Calendar");
        System.out.println(instanceFactory);
    }

    /**
     * 静态工厂
     */
    private static void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Calendar staticFactory = (Calendar) applicationContext.getBean("staticFactory");
        System.out.println(staticFactory);
    }

    private static void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
        person.eat();

        Person person1 = applicationContext.getBean(Person.class);
        System.out.println(person1);
        person1.eat();

        Person person2 = applicationContext.getBean("person", Person.class);
        System.out.println(person2);
        person2.eat();
    }
}
