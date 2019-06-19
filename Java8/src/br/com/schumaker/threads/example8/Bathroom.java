package br.com.schumaker.threads.example8;

/**
 *
 * @author Hudson Schumaker
 */
public class Bathroom {

    private static Bathroom INSTANCE = null;
    private boolean isDirty = true;

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

            if (isDirty) {
                waitForClean(guest);
            }

            System.out.println(guest + " making pee");
            try {
                Thread.sleep(4000);
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

            if (isDirty) {
                waitForClean(guest);
            }

            System.out.println(guest + " making poop");
            try {
                Thread.sleep(6000);
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

            if (isDirty) {
                waitForClean(guest);
            }

            System.out.println(guest + " removing clothes");
            System.out.println(guest + " taking shower");
            try {
                Thread.sleep(9000);
            } catch (InterruptedException ex) {
            }

            System.out.println(guest + " putting clothes");
            System.out.println(guest + " exit bathroom");
        }
    }

    public void clean() {
        String guest = Thread.currentThread().getName();
        System.out.println(guest + " knocking on the door...");

        synchronized (this) {
            System.out.println(guest + " enter bathroom");

            if (!this.isDirty) {
                System.out.println(guest + ", is not dirty, going out...");
                return;
            }

            System.out.println(guest + " cleaning bathroom");

            try {
                Thread.sleep(11000);
                this.notifyAll();
                this.isDirty = false;
            } catch (InterruptedException ex) {
            }

            System.out.println(guest + " exit bathroom");
        }
    }

    private void waitForClean(String guest) {
        System.out.println(guest + ", eca, bathroom is dirty!");
        try {
            this.wait();
        } catch (InterruptedException ex) {
        }
    }
}
