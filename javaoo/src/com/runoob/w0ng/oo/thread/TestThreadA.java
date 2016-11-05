package com.runoob.w0ng.oo.thread;

/**
 * Created by w0ng on 16/11/5.
 */

class ThreadDemos extends Thread {
    private Thread t;
    private String threadName;

    ThreadDemos(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread " + threadName + "," + i);
                Thread.sleep(5);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + "interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (null == t) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class TestThreadA {

    public static void main(String args[]) {
        ThreadDemos T1 = new ThreadDemos("Thread-1");
        T1.start();

        ThreadDemos T2 = new ThreadDemos("Thread-2");
        T2.start();
    }
}
