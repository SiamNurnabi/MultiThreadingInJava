package org.example.Order_2_ThreadPriorities;

public class Test {
    public static void main(String[] args) {
        System.out.println("Main Thread default priority::::: " + Thread.currentThread().getPriority());
        MyThread thread = new MyThread();
        thread.start();
//        Thread.currentThread().setPriority(7);
        System.out.println("Main Thread new priority::::: " + Thread.currentThread().getPriority());
        Runnable runnable = () -> {
            System.out.println("Child Thread new priority::::: " + Thread.currentThread().getPriority());
        };
        Thread thread1 = new Thread(runnable);
        thread1.setPriority(10);
        thread1.start();
        System.out.println("Main Thread current priority::::: " + Thread.currentThread().getPriority());
    }
}


// Some platforms may not support thread priorities.
// In such cases, the thread scheduler will ignore the priority of the thread and treat all threads as having the same priority.