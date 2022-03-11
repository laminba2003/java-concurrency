package com.training.concurrency;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {

    public void run() {
        try {
            System.out.println("Running Task! Thread Name: " +
                    Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(5);
            System.out.println("End of Running Task! Thread Name: " +
                    Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}