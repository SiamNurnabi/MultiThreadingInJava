package org.example.Order_5_SynchronizedBlock.Example1;

public class SynchronizedBlockDemo {
    public static void main(String[] args) {
        Display d = new Display(); // Only one object
        MyThread t1 = new MyThread(d, "Taskin");
        MyThread t2 = new MyThread(d, "Hridoy");
        t1.start();
        t2.start();
    }
}
