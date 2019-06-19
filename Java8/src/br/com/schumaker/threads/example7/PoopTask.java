package br.com.schumaker.threads.example7;

/**
 *
 * @author hudson schumaker
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
