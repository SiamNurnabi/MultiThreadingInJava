package org.example.Order_1_WayOfDefine.Part2;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Child Thread ::::: "+Thread.currentThread().getName());
    }
}
