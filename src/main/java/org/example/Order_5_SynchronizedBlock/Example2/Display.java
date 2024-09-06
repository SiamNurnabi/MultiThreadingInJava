package org.example.Order_5_SynchronizedBlock.Example2;

public class Display {
    public void wish(String name) {
        // 1 lac lines of code
        synchronized (Display.class) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Good Morning: ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name);
            }
        }
        // 1 lac lines of code
    }
}
