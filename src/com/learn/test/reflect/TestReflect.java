package com.learn.test.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflect {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls = Class.forName("com.learn.test.reflect.User");
        String name = cls.getName();
        Method[] methods = cls.getMethods();
        Field[] fields =  cls.getFields();
    }
}
