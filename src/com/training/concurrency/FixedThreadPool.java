package com.training.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

    public static void main(final String[] arguments) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.shutdown();
    }

}