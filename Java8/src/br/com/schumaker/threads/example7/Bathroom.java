package br.com.schumaker.threads.example7;

/**
 *
 * @author Hudson Schumaker
 */
public class Bathroom {

    private static Bathroom INSTANCE = null;

    private Bathroom() {
    }

    public static Bathroom getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Bathroom();
        }
        return INSTANCE;
    }

    public void makePee() {
        String guest = Thread.currentThread().getName();
        System.out.println(guest + " knocking on the door...");
        synchronized (this) {
            System.out.println(guest + " enter bathroom");
            System.out.println(guest + " making pee");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
            }
            System.out.println(guest + " flushing toilet");
            System.out.println(guest + " washing hands");
            System.out.println(guest + " exit bathroom");
        }
    }

    public void makePoop() {
        String guest = Thread.currentThread().getName();
        System.out.println(guest + " knocking on the door...");

        synchronized (this) {
            System.out.println(guest + " enter bathroom");
            System.out.println(guest + " making poop");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
            }

            System.out.println(guest + " flushing toilet");
            System.out.println(guest + " washing hands");
            System.out.println(guest + " exit bathroom");
        }
    }

    public void takeShower() {
        String guest = Thread.currentThread().getName();
        System.out.println(guest + " knocking on the door...");

        synchronized (this) {
            System.out.println(guest + " enter bathroom");
            System.out.println(guest + " removing clothes");
            System.out.println(guest + " taking shower");
            try {
                Thread.sleep(8000);
            } catch (InterruptedException ex) {
            }
            System.out.println(guest + " putting clothes");
            System.out.println(guest + " exit bathroom");
        }
    }
}
