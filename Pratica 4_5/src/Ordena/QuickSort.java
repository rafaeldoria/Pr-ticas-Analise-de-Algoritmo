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
public class QuickSort extends Ordena{
    int contCompara=0;
    int contTroca=0;
    public int i,j;
    
    public QuickSort () {
  }
    
    public QuickSort (Item[] vetor) {
        this.array = vetor;
  }
  
   public void quicksort () {
    this.ordena(0, this.array.length - 1);
    System.out.println("\nTotal de Comparações Método QuickSort: "+contCompara+"\n"+"Total de Trocas Método QuickSort: "+contTroca+"\n");
  }
  
  public void ordena (int e, int d) {
    this.particao (e, d);
    if (e < this.j){        
      this.ordena (e, this.j);      
    }
    if (this.i < d){
      this.ordena (this.i, d);      
    }
  }
  
  public void particao (int e, int d) {
    Item x, aux;

    this.i = e;
    this.j = d;
    x = this.array[(this.i + this.j) / 2];
    
    do {
      while (this.array[this.i].key < x.key){
        contCompara++;  
        this.i++;
      }
      while (this.array[this.j].key > x.key){ 
        contCompara++;
        this.j--;
      }
      if (this.i <= this.j) {
        aux = this.array[this.i];
        this.array[this.i] = this.array[this.j];
        this.array[this.j] = aux;
        this.i++;
        this.j--;        
        contTroca++;
      }
    } while (this.i <= this.j);
  }   
    
}
