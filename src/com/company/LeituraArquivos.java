package com.company;

import java.io.*;
import java.util.ArrayList;

public class LeituraArquivos {
    private String nomeArquivo;
    private File arquivo;
    private BufferedReader leitor;


    public LeituraArquivos(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        arquivo = new File(nomeArquivo);
        try {
            leitor = new BufferedReader(new FileReader(nomeArquivo));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Não foi possivel ler o arquivo!");
        }
    }

    public String[]lerArquivo(){
        int i=0;
        String[] linhas = new String[6];
        String aux;
        try {
            while ((aux = leitor.readLine()) != null){
                linhas[i] = aux;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return linhas;
    }
}


