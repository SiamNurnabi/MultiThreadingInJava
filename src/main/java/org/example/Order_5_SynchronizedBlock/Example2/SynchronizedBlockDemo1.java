package org.example.Order_5_SynchronizedBlock.Example2;

public class SynchronizedBlockDemo1 {
    public static void main(String[] args) {
        Display d1 = new Display();
        Display d2 = new Display();
        MyThread t1 = new MyThread(d1, "Taskin");
        MyThread t2 = new MyThread(d2, "Hridoy");
        t1.start();
        t2.start();
    }
}

//Note: In this case, we are using two Display objects d1 and d2. So, there is no chance of thread interference. Hence, we will get irregular output.
//      If we use only one Display object, then we will get regular output.
//      WHy? Because the synchronized block is synchronized on the object and only one thread can access the synchronized block at a time.
//
//       So, if we use class level lock, then we will get regular output.
//      why? Because the synchronized block is synchronized on the class and only one thread can access the synchronized block at a time.


