package com.learn.test.concurrent;

import java.util.concurrent.*;

public class TestThreadPool {

    private static volatile  String s =  "s";

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);

        ExecutorService service2 = Executors.newScheduledThreadPool(10);

        ThreadPoolExecutor threadPool =
                new ThreadPoolExecutor(4, 10,
                        1000, TimeUnit.SECONDS, new LinkedBlockingQueue<>(10));
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Execute 1 start");
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Execute 1 end");
            }
        });

        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Execute 2 start");
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Execute 2 end");
            }
        });

        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Execute 3 start");
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Execute 3 end");
            }
        });

        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Execute 4 start");
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Execute 4 end");
            }
        });
    }
}
