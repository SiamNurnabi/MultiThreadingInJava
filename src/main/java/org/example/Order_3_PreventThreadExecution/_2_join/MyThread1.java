package org.example.Order_3_PreventThreadExecution._2_join;

public class MyThread1  extends Thread{
    static Thread thread;
    public void run() {
        try{
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(" Child Thread");
        }
    }
}
