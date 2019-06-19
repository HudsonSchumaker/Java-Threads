package br.com.schumaker.threads.example10;

/**
 *
 * @author hudsonschumaker
 */
public class PoolDeConexao {

    public String getConnection() {

        System.out.println("Emprestando conexão");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        return "connection";
    }
}
