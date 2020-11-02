package com.learn.test.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class TestReentrantLock {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.tryLock();
        lock.tryLock();
        System.out.println("-------------------");
        lock.unlock();
    }
}
