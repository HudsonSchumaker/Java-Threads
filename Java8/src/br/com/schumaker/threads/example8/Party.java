package br.com.schumaker.threads.example8;

/**
 *
 * @author Hudson Schumaker
 */
public class Party {
    public static void main(String... args) {
        
        Bathroom sharedBathroom = Bathroom.getInstance();
        
        Thread cleaner = new Thread(new CleanTask(sharedBathroom), "Cleaner");
        Thread guest1 = new Thread(new PissTask(sharedBathroom), "Paul");
        Thread guest2 = new Thread(new PissTask(sharedBathroom), "Alex");
        Thread guest3 = new Thread(new PoopTask(sharedBathroom), "William");
        Thread guest4 = new Thread(new PoopTask(sharedBathroom), "Marta");
        Thread guest5 = new Thread(new ShowerTask(sharedBathroom), "Bush");
        Thread guest6 = new Thread(new ShowerTask(sharedBathroom), "Hilary");
        
        guest1.start();
        guest2.start();
        guest3.start();
        guest4.start();
        guest5.start();
        guest6.start();
        cleaner.start();
    }
}
