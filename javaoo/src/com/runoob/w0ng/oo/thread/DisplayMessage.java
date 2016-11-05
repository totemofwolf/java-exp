package com.runoob.w0ng.oo.thread;

/**
 * Created by w0ng on 16/11/5.
 */
public class DisplayMessage implements Runnable {

    private String message;

    public DisplayMessage(String message) {
        this.message = message;
    }

    public void run() {
        while (true) {
            System.out.println(message);
        }
    }
}
