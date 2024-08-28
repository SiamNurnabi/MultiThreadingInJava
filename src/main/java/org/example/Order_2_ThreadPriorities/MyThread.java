package org.example.Order_2_ThreadPriorities;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Child Thread default priority::::: " + Thread.currentThread().getPriority());
    }
}
