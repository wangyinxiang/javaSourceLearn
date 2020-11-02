package com.learn.test.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class TestBlockingQueue {

    public static void main(String[] args) {
        ArrayBlockingQueue queue = new ArrayBlockingQueue(10);

        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();

        DelayQueue delayQueue = new DelayQueue();

        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
    }
}
