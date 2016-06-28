/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgItem;

import java.io.IOException;
import java.io.RandomAccessFile;
import Alunos.Alunos;

/**
 *
 * @author Rafael
 */
public class MeuItem implements Item{
    private int chave;
    Alunos aluno;  
    
  public MeuItem (int chave) { 
	    this.chave = chave; 
  }
  
  public MeuItem (int chave, Alunos aluno) { 
    this.chave = chave; 
    this.aluno = aluno;
  }
  
  @Override
  public int compara (Item it) {
    MeuItem item = (MeuItem) it;
    if (this.chave < item.chave){ 
      return -1;      
    }else {
      if (this.chave > item.chave) 
        return 1;      
    }
    
    return 0;
  }
  
  public void alteraChave (Object chave) {
    Integer ch = (Integer) chave; 
    this.chave = ch.intValue ();
  }
  
  public Object recuperaChave () { 
    return new Integer (this.chave); 
  }
  
  public String toString () { 
    return  "Codigo: " + this.chave + "\nNome do Aluno: " + this.aluno.getNomeAluno() +	"\nData: " + this.aluno.getData() + "\nNota: " + this.aluno.getNota() + "\n";
  }
  
  public void gravaArq (RandomAccessFile arq) throws IOException {
    arq.writeInt (this.chave);
  }
  
  public void leArq (RandomAccessFile arq) throws IOException {
    this.chave = arq.readInt ();
  }
 
  public static int tamanho () { 
    return 4; /*Tamanho da chave = tamanho do inteiro em Java = 4 bytes.
                Se novos campos forem inseridos no registro, aumentar o 
                valor de retorno do m�todo para o tamanho apropriado.*/ 
  }


}
