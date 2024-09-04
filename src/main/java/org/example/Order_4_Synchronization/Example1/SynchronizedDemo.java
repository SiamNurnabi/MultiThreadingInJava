package org.example.Order_4_Synchronization.Example1;

public class SynchronizedDemo {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Taskin");
        MyThread t2 = new MyThread(d, "Shariful");
        MyThread t3 = new MyThread(d, "Hridoy");
        t1.start(); //  t1 thread acquired the lock of d object.
        t2.start();
        t3.start();
    }
}
