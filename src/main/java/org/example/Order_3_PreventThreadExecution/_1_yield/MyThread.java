package org.example.Order_3_PreventThreadExecution._1_yield;

public class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
            Thread.yield(); // if we comment this line then main thread and child thread will be executed concurrently. we can't expect exact output.
            // if we don't comment this line then main thread will get chance first and then child thread will get chance. This cycle will be repeated.
            // chance of completing child thread first is very less.
        }
    }
}


// Some platforms won't properly support for yield method. In such cases, yield method behaves like normal method.
