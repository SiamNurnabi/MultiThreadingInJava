package org.example.Order_7_DeadLockStarvation;

public class B {
    public synchronized void d1(A a)  {
        System.out.println("Thread 2 starts execution of d1 method");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread 2 trying to call A's last method");
        a.last(); // If the last method is not synchronized then there is no deadlock.
    }

    public synchronized void last(){
        System.out.println("Inside B, this is last method of B");
    }
}
