package org.example.Order_4_Synchronization.Example1;

public class SynchronizedDemo1 {
    public static void main(String[] args) {
        Display d1 = new Display();
        Display d2 = new Display();
        MyThread t1 = new MyThread(d1, "Taskin");
        MyThread t2 = new MyThread(d2, "Shariful");
        t1.start(); //  t1 thread acquired the lock of d object.
        t2.start();
    }
}
