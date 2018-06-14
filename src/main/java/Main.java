
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author a1986775
 */
public class Main {

    /*public static void main(String[] args) throws IOException {

        try{
         BufferedReader br = new BufferedReader(new FileReader("Historia.txt"));
         while(br.ready()){
            String linha = br.readLine();
            System.out.println(linha);
         }
         br.close();
      }catch(IOException ioe){
         ioe.printStackTrace();
      }
   
    }*/
    public static void main(String[] args){
        
        Scanner ler = new Scanner("Historia.txt");
        String nome = ler.nextLine();
        Vocabulario[] vocab = new Vocabulario[947];

        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            String textoConteudo = "";
            while (linha != null) {
                textoConteudo += linha;
                linha = lerArq.readLine();
            }
            String linhas[] = textoConteudo.split("\\s");
            for (int i = 0; i < linhas.length; i++) {
                
                vocab[i] = new Vocabulario(linhas[i]);                 
                
                System.out.println(vocab[i].palavra);
            }
            arq.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
