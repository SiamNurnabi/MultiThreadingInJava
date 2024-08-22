package org.example.Order_1_WayOfDefine.Part1;

public class ThreadDemo {
    // Main thread is responsible to execute main method.
    public static void main(String[] args) {
        MyThread thread = new MyThread();  // Create a thread object. Thread instantiation.
        thread.start();  // Start the thread. Thread start. It will call the run method. Main thread has started the child thread here.
        for (int i = 0; i < 10; i++) { // this loop is executed by main thread
            System.out.println("Main Thread ::::: " + Thread.currentThread().getName());
        }
        thread.run(10); // This will call the run method of MyThread class. This is not a thread start. This is a normal method call.

        // This will throw an exception. Because the thread is already started. We can't start a thread again.
//        thread.start();
    }
}


// If the jobs are independent, we want to execute it parallely then we should go for threads.