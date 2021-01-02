package br.com.schumaker.threads.example5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Hudson Schumaker
 */
public class AbrirArquivo implements ActionListener {

    private JTextField word;
    private JTextArea resultado;

    public AbrirArquivo(JTextField word, JTextArea resultado) {
        this.word = word;
        this.resultado = resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser(System.getProperty("user.home") + "/Downloads");
        chooser.setDialogTitle("Abrir Arquivo");
        chooser.setApproveButtonText("Abrir");
        int sf = chooser.showOpenDialog(null);

        if (sf == JFileChooser.APPROVE_OPTION) {
            String filePath = chooser.getSelectedFile().getAbsolutePath();
            Thread t = new Thread(new BuscaEmArquivoTexto(filePath, word.getText(), resultado));
            t.setPriority(Thread.MAX_PRIORITY);
            t.start();
        }
    }
}
