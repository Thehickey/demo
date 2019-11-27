package com;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

public class A implements FactoryBean, InitializingBean {

    private B b;
    private C c;

    public A() {
    }

    public A(B b, C c) {
        System.out.println("这是A的构造函数");
        this.b = b;
        this.c = c;
    }

    public void init(){
        System.out.println("这个类的初始化代码,不是在构造函数");
    }

    public void setB(B b) {
        System.out.println("这是B的set方法");
        this.b = b;
    }

    public void setC(C c) {
        System.out.println("这是C的set方法");
        this.c = c;
    }

    @Override
    public Object getObject() throws Exception {
        return new A();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("???");
    }

    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                ", c=" + c +
                '}';
    }
}
