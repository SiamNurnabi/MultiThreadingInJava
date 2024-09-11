package org.example.Order_6_InterThreadCommunication.Example;

public class ThreadB extends Thread {
    int total = 0;

    public void run() {

        for (int i = 1; i <= 100; i++) {
            total += i;
        }
//        this.notify(); // this will notify the main thread that the thread has finished. This will throw an IllegalMonitorStateException. We need to use synchronized block to avoid this exception.
        // 10 million code lines
    }
}
