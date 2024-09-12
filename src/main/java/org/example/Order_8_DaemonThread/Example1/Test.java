package org.example.Order_8_DaemonThread.Example1;

public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "::" + Thread.currentThread().isDaemon()); // main::false
        Thread.currentThread().setDaemon(true); // IllegalThreadStateException
        DaemonThread daemonThread = new DaemonThread();
        System.out.println(daemonThread.getName() + "::" + daemonThread.isDaemon()); // Thread-0::false
        daemonThread.setDaemon(true);
        System.out.println(daemonThread.getName() + "::" + daemonThread.isDaemon()); // Thread-0::true

    }
}
