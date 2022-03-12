package com.training.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

    public static void main(final String[] arguments) throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(new Task(), 2, 2, TimeUnit.SECONDS);
        executor.awaitTermination(20, TimeUnit.SECONDS);
        executor.shutdown();
    }

}