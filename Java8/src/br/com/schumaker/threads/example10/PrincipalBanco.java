package br.com.schumaker.threads.example10;

/**
 *
 * @author hudsonschumaker
 */
public class PrincipalBanco {

    public static void main(String[] args) {

        GerenciadorDeTransacao tx = new GerenciadorDeTransacao();
        PoolDeConexao pool = new PoolDeConexao();
    }
}
