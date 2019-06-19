package br.com.schumaker.threads.example11;

/**
 *
 * @author hudson schumaker
 */
public class ScheduledTask implements Runnable {

    @Override
    public void run() {
        System.out.println("started");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) { 
        }
        System.out.println("finished");
    }
}
