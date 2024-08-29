package org.example.Order_3_PreventThreadExecution._2_join;

public class TestJoinForMainThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread1.thread = Thread.currentThread();
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        myThread1.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
            Thread.sleep(2000);

        }
    }
}
