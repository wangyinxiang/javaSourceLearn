package com.learn.test.concurrent;

import java.util.concurrent.CountDownLatch;

// 老板进入会议室等待 5 个人全部到达会议室才会开会
public class TestCountDownLatch {

    private static CountDownLatch countDownLatch = new CountDownLatch(5);

    /**
     * Boss线程，等待员工到达开会
     */
    static class BossThread extends Thread{

        public void run(){
            System.out.println("Boss在会议室等待，总共有" + countDownLatch.getCount() + "个人开会...");
            try {
                //Boss等待
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("所有人都已经到齐了，开会吧...");
        }
    }

    /**
     * 员工线程-到达会议室
     */
    static class EmpleoyeeThread extends Thread{

        public void run(){
            System.out.println(Thread.currentThread().getName() + "，到达会议室....");
            countDownLatch.countDown();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //Boss线程启动
        new BossThread().start();

        for(int i = 0 ; i < countDownLatch.getCount() ; i++){
            new EmpleoyeeThread().start();
        }
    }
}
