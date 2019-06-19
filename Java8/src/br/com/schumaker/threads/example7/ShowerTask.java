package br.com.schumaker.threads.example7;

/**
 *
 * @author hudson schumaker
 */
public class ShowerTask implements Runnable {
    private final Bathroom bathroom;

    public ShowerTask(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        bathroom.takeShower();
    }
}
