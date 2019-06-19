package br.com.schumaker.threads.example2.comthread;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Hudson Schumaker
 */
public class AcaoBotao implements ActionListener {

    private final JTextField primeiro;
    private final JTextField segundo;
    private final JLabel resultado;

    public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultado = resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Thread(new ThreadCalcula(primeiro, segundo, resultado)).start();   
    }
}
