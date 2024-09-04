package org.example.Order_4_Synchronization.Example2;

public class Display {
    public synchronized void displayN() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public synchronized  void displayC() {
        for (int i = 65; i < 75; i++) {
            System.out.print((char) i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
