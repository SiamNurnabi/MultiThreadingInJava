package org.example.Order_4_Synchronization.Example1;

public class Display {
    public static synchronized void wish(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Good Morning: ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("I got interrupted");
            }
            System.out.println(name);
        }
    }
}
