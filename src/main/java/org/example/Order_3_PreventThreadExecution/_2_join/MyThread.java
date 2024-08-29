package org.example.Order_3_PreventThreadExecution._2_join;

public class MyThread extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
