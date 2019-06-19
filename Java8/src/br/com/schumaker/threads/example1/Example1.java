package br.com.schumaker.threads.example1;

/**
 *
 * @author hudsonschumaker
 */
public class Example1 {
    public static void main(String... args) {
        System.out.println("Iniciou o programa");
        try {
            // Dorme por 50 segundos
            Thread.sleep(50000);
        } catch (InterruptedException ex) {}
        
        System.out.println("Fim programa");
    }
}
