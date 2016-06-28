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
public class HeapSort extends Ordena{
    public int contCompara;
    public int contTroca;
    
     public HeapSort () {
  }
  
  public HeapSort (Item[] vetor) {
    this.array = vetor;
  }
   
  public void heapSort () {
    buildMaxHeap();
    int n = this.array.length;

    for (int i = this.array.length - 1; i > 0; i--) {
      trocar(i, 0);
      maxHeapify(0,--n);
    }
  System.out.println("\nTotal de Comparações Método QuickSort: "+contCompara+"\n"+"Total de Trocas Método QuickSort: "+contTroca+"\n");
    
  }  
  
  public void buildMaxHeap() {
    for (int i = this.array.length / 2 - 1; i >= 0; i--)
      maxHeapify(i,this.array.length);
  }
  
  public void maxHeapify( int pos, int vet)  {  
    int e = esquerda(pos);
    int d = direita(pos);  
         
    if (e < vet)  {  
      if (d < vet && this.array[e].key < this.array[d].key)  {
        e= d;
        contCompara++;
      }
      if (this.array[e].key > this.array[pos].key) {  
        trocar(e, pos);
        maxHeapify(e,vet); 
        contCompara++;
      }  
    }  
  }
  
  public void trocar(int j, int aposJ) {
    Item aux;
    aux = this.array[j];
    this.array[j] = this.array[aposJ];
    this.array[aposJ] = aux;
    contTroca++;
 }
  
  public int esquerda ( int i ) {
    return 2 * i + 1;
  }
  
  public int direita ( int i ) {
   return 2 * i + 2;
 }
    
}
