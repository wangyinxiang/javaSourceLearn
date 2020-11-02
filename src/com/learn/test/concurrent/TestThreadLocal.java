package com.learn.test.concurrent;

// 对于ThreadLocal需要注意的有两点：
// 1. ThreadLocal实例本身是不存储值，它只是提供了一个在当前线程中找到副本值得key
// 2. 是ThreadLocal包含在Thread中，而不是Thread包含在ThreadLocal中
public class TestThreadLocal {

    private static ThreadLocal<Integer> seqCount = new ThreadLocal<Integer>(){
        // 实现initialValue()
        public Integer initialValue() {
            return 0;
        }
    };

    public int nextSeq(){
        seqCount.set(seqCount.get() + 1);
        return seqCount.get();
    }

    public static void main(String[] args) {
        TestThreadLocal ttl = new TestThreadLocal();

        SeqThread thread1 = new SeqThread(ttl);
        SeqThread thread2 = new SeqThread(ttl);
        SeqThread thread3 = new SeqThread(ttl);
        SeqThread thread4 = new SeqThread(ttl);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

    private static class SeqThread extends Thread{

        private TestThreadLocal testThreadLocal;

        SeqThread(TestThreadLocal testThreadLocal){
            this.testThreadLocal = testThreadLocal;
        }

        public void run(){
            for(int i = 0 ; i < 3 ; i++){
                System.out.println(Thread.currentThread().getName() + " seqCount :" + testThreadLocal.nextSeq());
            }
        }

    }
}
