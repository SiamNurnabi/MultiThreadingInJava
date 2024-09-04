package org.example.Order_4_Synchronization.Example2;


public class SynchronizedDemo {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);
        t1.start(); //  t1 thread acquired the lock of d object.
        t2.start();
    }
}
