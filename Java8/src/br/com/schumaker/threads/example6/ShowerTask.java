package br.com.schumaker.threads.example6;

/**
 *
 * @author Hudson Schumaker
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
