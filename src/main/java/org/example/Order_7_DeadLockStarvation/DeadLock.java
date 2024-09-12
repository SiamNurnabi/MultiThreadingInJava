package org.example.Order_7_DeadLockStarvation;

public class DeadLock extends Thread {
    A a = new A();
    B b = new B();

    @Override
    public void run() {
        System.out.println("In child thread");
        b.d1(a); // Child thread is responsible to execute this. Here child thread will enter into waiting state to get a's lock and currently child hold b's lock

    }

    public void m1() {
        this.start(); // Child thread will be started. If we start the child thread from main thread then there is no deadlock. Because object b or a will not be locked by main thread.
        a.d1(b);  // Main thread is responsible to execute this. Here main thread will enter into waiting state to get b's lock and currently main hold a's lock
    }

    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        deadLock.m1();
    }
}

/*
Note: In the above code, if we remove at least one synchronized keyword, then the program will not enter into deadlock state.
Hence, synchronized keyword is the root cause of deadlock. Due to this by using synchronized keyword, we need to be very careful.
 */