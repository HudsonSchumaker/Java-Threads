package br.com.schumaker.threads.example5;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Hudson Schumaker
 */
public class TelaBusca {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Busca em arquivo Texto");
        JTextField word = new JTextField(10);
        JButton escolherArquivo = new JButton("abrir arquivo");
        JTextArea resultado = new JTextArea("           ?          ");
        resultado.setLineWrap(true);
        resultado.setColumns(30);
        resultado.setRows(5);

        String filePath = "";
        escolherArquivo.addActionListener(new AbrirArquivo(filePath, word, resultado));
        
        JPanel painel = new JPanel();
        painel.add(word);
        painel.add(escolherArquivo);
        painel.add(resultado);
        
        janela.add(painel);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        janela.setSize(300, 100);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}
