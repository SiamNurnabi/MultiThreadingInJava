package org.example.Order_8_DaemonThread.Example2;

public class Test {
    public static void main(String[] args) {
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread::" + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("End of main thread");
    }
}


/*
If we comment the line thread.setDaemon(true); Both main and child are non-daemon threads. So both threads will be executed until their completion.
If we uncomment the line thread.setDaemon(true); Then main is non-daemon and child is daemon thread.
Hence, when main thread completes its execution, automatically child thread will be terminated. In this case, child thread will not be executed completely.
 */