package org.example.Order_3_PreventThreadExecution._3_sleep;


public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread(); // Normal case where interruption will happen
        MyThread1 myThread1 = new MyThread1(); // No interruption will happen.
        MyThread2 myThread2 = new MyThread2(); // Interruption will wait for the child to go in sleeping or waiting state
        myThread.start();
        myThread.interrupt(); // this will interrupt the child thread. If the child thread is in sleeping state, then it will throw InterruptedException.
        // if we comment this line, then the main thread will wait for the child thread to complete. if we uncomment this line, then the main thread will not wait for the child thread to complete.
        System.out.println("End of main thread");
    }
}
