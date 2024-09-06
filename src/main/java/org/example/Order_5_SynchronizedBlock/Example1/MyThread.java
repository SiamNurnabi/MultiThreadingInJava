package org.example.Order_5_SynchronizedBlock.Example1;

public class MyThread extends Thread {
    Display d;
    String name;

    public MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
    }
}
