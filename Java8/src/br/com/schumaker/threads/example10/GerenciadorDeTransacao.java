package br.com.schumaker.threads.example10;

/**
 *
 * @author hudsonschumaker
 */
public class GerenciadorDeTransacao {

    public void begin() {

        System.out.println("Começando a transação");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }
}
