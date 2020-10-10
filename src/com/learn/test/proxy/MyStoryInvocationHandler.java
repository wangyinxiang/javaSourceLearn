package com.learn.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyStoryInvocationHandler implements InvocationHandler {

    private Object object;

    public MyStoryInvocationHandler(Object o) {
        this.object = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("力宏，我是你代理经纪人："+proxy.getClass().getName());
        //处理业务
        System.out.println("巴拉巴拉......(讲了一个故事)");

        for(Object arg:args) {
            System.out.println("传入的参数："+arg);
        }

        //通过反射机制，通知力宏做事情
        method.invoke(object, args);

        //处理业务
        System.out.println("巴拉巴拉，感谢........");

        return null;
    }
}
