package org.example.Order_6_InterThreadCommunication.Example;

public class ThreadA extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            System.out.println("Child thread starts calculation"); // Order - 2
            for (int i = 1; i <= 100; i++) {
                total += i;
            }
            System.out.println("Child thread trying to give notification"); // Order - 3
            this.notify(); // this will notify the main thread that the thread has finished.
            // 10 million code lines
        }
    }
}