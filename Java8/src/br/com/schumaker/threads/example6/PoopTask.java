package br.com.schumaker.threads.example6;

/**
 *
 * @author hudsonschumaker
 */
public class PoopTask implements Runnable {
    private final Bathroom bathroom;

    public PoopTask(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        bathroom.makePoop();
    }
}
