package org.example.Order_7_DeadLockStarvation;

public class A {
    public synchronized void d1(B b)  {
        System.out.println("Thread 1 starts execution of d1 method");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread 2 trying to call B's last method");
        b.last(); // If the last method is not synchronized then there is no deadlock.
    }
    public synchronized void last(){
        System.out.println("Inside A, this is last method of A");
    }

}
