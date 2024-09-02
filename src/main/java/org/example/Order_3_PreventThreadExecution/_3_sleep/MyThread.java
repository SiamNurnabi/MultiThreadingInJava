package org.example.Order_3_PreventThreadExecution._3_sleep;

public class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.println("I am lazy thread" + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("I got interrupted");
        }

    }
}

