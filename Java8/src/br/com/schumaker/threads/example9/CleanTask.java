package br.com.schumaker.threads.example9;

/**
 *
 * @author hudson schumaker
 */
public class CleanTask implements Runnable {

    private final Bathroom bathroom;

    public CleanTask(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        for (;;) {
            bathroom.clean();
            try {
                Thread.sleep(14000);
            } catch (InterruptedException e) {
            }
        }
    }
}
