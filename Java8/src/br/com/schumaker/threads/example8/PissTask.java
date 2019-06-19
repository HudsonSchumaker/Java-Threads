package br.com.schumaker.threads.example8;

/**
 *
 * @author hudson schumaker
 */
public class PissTask implements Runnable {

    private final Bathroom bathroom;

    public PissTask(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        bathroom.makePee();
    }
}
