/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordena;
import Item.Item;

/**
 *
 * @author Rafael
 */
public class Insercao extends Ordena{
    int contCompara=0;
    int contTroca=0;
    
    public Insercao () {
  }
    
    public Insercao (Item[] vetor) {
        this.array = vetor;
  }
    
   public void insercao () {
    int i, j, n = this.array.length;
    Item menor;
    
    for (j = 1; j < n; j++) {
      menor = this.array[j];
      contCompara++;
      for (i = j - 1; (i >= 0) && (this.array[i].key > menor.key); i--){
        this.array[i + 1] = this.array[i];
        contTroca++;
      }
      this.array[i + 1] = menor;      
    }
    System.out.println("\nTotal de Comparações Método Inserção: "+contCompara+"\n"+"Total de Trocas Método Inserção: "+contTroca+"\n");
  }

}
