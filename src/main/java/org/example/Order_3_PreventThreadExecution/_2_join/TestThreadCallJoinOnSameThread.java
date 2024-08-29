package org.example.Order_3_PreventThreadExecution._2_join;

public class TestThreadCallJoinOnSameThread {
    public static void main(String[] args) throws InterruptedException {
       Thread.currentThread().join();
    }
}
