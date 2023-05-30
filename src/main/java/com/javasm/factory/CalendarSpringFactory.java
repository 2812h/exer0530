package com.javasm.factory;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

public class CalendarSpringFactory implements FactoryBean<Calendar> {
    /**
     * 使用工厂接口产生对象
     * @return
     * @throws Exception
     */
    @Override
    public Calendar getObject() throws Exception {
        return Calendar.getInstance();
    }

    /**
     * 获取对象的类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }

    /**
     * 工厂产生的对象是否是单例模式
     * 默认返回true，JDK8以后就不需要在实现
     * @return
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
