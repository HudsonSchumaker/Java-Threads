
package br.com.schumaker.threads.example12;

import java.util.concurrent.Callable;

/**
 *
 * @author Hudson Schumaker
 */
public class MyCallable implements Callable<String> {

    private final long waitTime;

    public MyCallable(int timeInMillis) {
        this.waitTime = timeInMillis;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(waitTime);
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
    }
}
