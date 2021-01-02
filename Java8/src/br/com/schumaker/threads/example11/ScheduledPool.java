package br.com.schumaker.threads.example11;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Hudson Schumaker
 */
public class ScheduledPool {
    public static void main(String... args) {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(4);
        
        Thread task = new Thread(new ScheduledTask());
        pool.scheduleAtFixedRate(task, 0, 5, TimeUnit.SECONDS);
        
    }
}
