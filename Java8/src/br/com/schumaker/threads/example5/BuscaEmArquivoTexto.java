package br.com.schumaker.threads.example5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Hudson Schumaker
 */
public class BuscaEmArquivoTexto implements Runnable {

    private final String filePath;
    private final String search;
    private final JTextArea resultado;

    public BuscaEmArquivoTexto(String filePath, String search, JTextArea resultado) {
        this.filePath = filePath;
        this.search = search;
        this.resultado = resultado;
    }

    @Override
    public void run() {
        int numeroLinha = 1;
        StringBuilder str = new StringBuilder();
        str.append(filePath).append("\n");
        
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                if (linha.toLowerCase().contains(search.toLowerCase())) {
                    str.append(numeroLinha).append(" ").append(linha);
                    resultado.setText(str.toString());
                }
                numeroLinha++;
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
}
