package com.training.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {

    public static void main(final String[] arguments) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.shutdown();
    }

}