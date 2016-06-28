/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arvore;
import java.io.*;
import pkgItem.Item;
import pkgItem.MeuItem;
import Arvore.ArvoreBinaria;


/**
 *
 * @author Rafael
 */
public class SalvaArquivo {
    
            public void SalvarArquivo(StringBuilder registro){
            File arq = null;
            FileOutputStream saida = null;
            OutputStreamWriter gravador = null;
            BufferedWriter buffer_saida = null;

            try {      
            arq = new File ("AtualAlunos.txt");
            saida = new FileOutputStream (arq);
            gravador = new OutputStreamWriter (saida, "UTF8");
            buffer_saida = new BufferedWriter (gravador);       
            
            buffer_saida.write(registro.toString());
            
            System.out.println ("Gravação concluída!");
            } catch (Exception e) {
            e.printStackTrace ();
            } finally {
            try {
              if (buffer_saida != null) 
                buffer_saida.close ();            
              if (gravador != null) 
                gravador.close ();
              if (saida != null) 
                saida.close ();
            } catch (Exception e) {
              e.printStackTrace ();
            }
          } 
    }
}
