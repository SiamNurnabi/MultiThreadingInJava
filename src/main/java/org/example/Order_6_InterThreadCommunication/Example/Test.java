package org.example.Order_6_InterThreadCommunication.Example;

public class Test {
    public static void main(String[] args) throws InterruptedException {
//
//        ThreadB threadB = new ThreadB();
//        threadB.start();
//        Thread.sleep(3000); // this is a bad practice, because we don't know how long the thread will take to finish
//        threadB.join(); // this is a better practice, because it waits for the thread to finish
//        threadB.wait(); // this is the best practice, because it doesn't block the main thread. But this will throw an IllegalMonitorStateException. We need to use synchronized block to avoid this exception.

        ThreadA threadA = new ThreadA();
        threadA.start();
        synchronized (threadA) {
            System.out.println("Waiting for threadA to complete..."); // Order - 1
            threadA.wait();
            System.out.println("Main thread got notification"); // Order - 4
            System.out.println("Total: " + threadA.total); // Order - 5
        }

//        ThreadA threadA = new ThreadA();
//        threadA.start();
//        Thread.sleep(3000); // Child thread will get the chance to execute first. So child thread will notify the main thread. but the main thread is not waiting for the notification. So it will not get the notification.
//        synchronized (threadA) {
//            System.out.println("Waiting for threadA to complete..."); // Order - 1
//            threadA.wait(); // If the child thread notifies the main thread before the main thread waits, the main thread will not get the notification. So main thread will wait indefinitely.
//            threadA.wait(10000); // If the child thread notifies the main thread before the main thread waits, the main thread will not get the notification. So main thread will wait for 10 seconds and then continue.
//            System.out.println("Main thread got notification"); // Order - 4
//            System.out.println("Total: " + threadA.total); // Order - 5
//        }
    }
}

// Note: The join() method waits for the thread to die. In other words, it waits for the run() method to complete.
// If we want a value from a child thread and there is more code to run after updating the value in the child thread, using join() method is not recommended.
// Because it will block the main thread until the child thread completes its execution.
// In this case, we can use Wait and Notify methods to achieve the same result without blocking the main thread.


