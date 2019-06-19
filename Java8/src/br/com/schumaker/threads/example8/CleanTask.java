package br.com.schumaker.threads.example8;

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
        bathroom.clean();
    }
}
