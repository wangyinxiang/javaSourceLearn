package com.learn.test.concurrent;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class TestAQS extends AbstractQueuedSynchronizer {

    public static void main(String[] args) {

    }

    private static class Syn extends AbstractQueuedSynchronizer{

        public void lock(){

        }

        public final boolean tryAcquire(int arg){
            int state = getState();
            if(state == 0){
                if(compareAndSetState(0, arg)){
                    setExclusiveOwnerThread(Thread.currentThread());
                    return true;
                }
            }else if(getExclusiveOwnerThread() == Thread.currentThread()){ // 重入
                if(compareAndSetState(state, state + arg)){
                    return true;
                }
            }
            return false;
        }
    }
}