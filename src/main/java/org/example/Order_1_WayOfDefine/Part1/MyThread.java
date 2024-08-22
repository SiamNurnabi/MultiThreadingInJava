package org.example.Order_1_WayOfDefine.Part1;

public class MyThread extends Thread {
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("No arg Child Thread ::::: "+Thread.currentThread().getName());
        }
    }

    public void run(int i){
        System.out.println("Int arg run method");
    }

    // This is not a good practice to override the start method. Because the start method is responsible to create a new thread and call the run method.
//    @Override
//    public void start(){
//        System.out.println("Start method");
//    }

    @Override
    public void start(){
        super.start();// This will create a new thread and call the run method.
        System.out.println("Start method::::: " + Thread.currentThread().getName()); // This will be executed by main thread.
        System.out.println(Thread.currentThread().getName()); // This will print the name of the current thread.
    }
}
