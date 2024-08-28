package org.example.Order_1_WayOfDefine.Part2;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread.currentThread().setName("Custom Name");
//        MyRunnable runnable4 = new MyRunnable();
        Runnable runnable = new MyRunnable(); // Normal way of defining a thread
        Runnable runnable1 = () -> { // Lambda Expression. This is a new way of defining a thread. This is a new feature in Java 8.
            System.out.println("Child Thread ::::: " + Thread.currentThread().getName());
        };
        Runnable runnable2 = new Runnable() { // Anonymous Inner Class. This is a new way of defining a thread.
            @Override
            public void run() {
                System.out.println("Child Thread ::::: " + Thread.currentThread().getName());
            }
        };
        Thread thread = new Thread(runnable,"Child"); // target runnable
        thread.start();
        thread = new Thread(runnable1);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread ::::: " + Thread.currentThread().getName());
        }
    }
}
