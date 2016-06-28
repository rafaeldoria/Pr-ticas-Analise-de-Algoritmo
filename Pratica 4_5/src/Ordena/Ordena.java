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
public class Ordena {
    Item [] array;
    
    public Ordena () {
  }
    
    public Ordena (Item[] vetor) {
    this.array = vetor;
  }

    public Item[] getVetor () {
        return array;
  }    

    public void setVetor (Item[] vetor) {
        this.array = vetor;
  }    
    
    public void imprimir () {
    int i, n = this.array.length;    
    for (i = 0; i < n; i++){ 
      System.out.print (this.array[i].key + " - ");  
    }System.out.print("\n");   
  } 
    
}
