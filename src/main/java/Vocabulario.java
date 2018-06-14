

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1986775
 */
public class Vocabulario {
    
    protected String palavra;
    protected int apar[] = new int [30];
    protected int numAp;
    
    Vocabulario(String palavra){
        String replace;
        replace = palavra.replace(',', ' ');
        replace = replace.replace('.', ' ');
        replace = replace.replace(':', ' ');
        replace = replace.replace(';', ' ');
        replace = replace.replace('-', ' ');
        replace = replace.replace('?', ' ');
        replace = replace.replace('!', ' ');
        replace = replace.replace('(', ' ');
        replace = replace.replace(')', ' ');
        replace = replace.replace('[', ' ');
        replace = replace.replace('}', ' ');
        
        this.palavra = replace;
    }

    Vocabulario() {}
}
