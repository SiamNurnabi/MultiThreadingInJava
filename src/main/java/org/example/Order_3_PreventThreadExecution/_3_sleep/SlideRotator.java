package org.example.Order_3_PreventThreadExecution._3_sleep;

public class SlideRotator {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Slide " + i);

            Thread.sleep(5000);
        }
    }
}
