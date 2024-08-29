package org.example.Order_3_PreventThreadExecution._2_join;

public class Test {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        try {
//            thread.join();
            thread.join(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
