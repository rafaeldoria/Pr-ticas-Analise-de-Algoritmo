/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;

import item.Item;

/**
 *
 * @author Rafael
 */
public class Ordena {
    Item [] vetBubble;
    int contCompara=0;
    int contTroca=0;
        
    public Ordena (Item[] vetor) {
    this.vetBubble = vetor;
  }

    public Item[] getVetor () {
        return vetBubble;
  }    

    public void setVetor (Item[] vetor) {
        this.vetBubble = vetor;
  }    

    public void bolha () {
    int i, j, n = this.vetBubble.length;
    Item aux;    
    for (i = 0; i < n - 1; i++){
      for (j = 1; j < n - i; j++){  
        contCompara++;         
        if (vetBubble[j].key < vetBubble[j - 1].key) {
          aux = vetBubble[j];
          vetBubble[j] = vetBubble[j-1];
          vetBubble[j-1] = aux;
          contTroca++;
                }
            }
        }  
        System.out.println("\nTotal de Comparações: "+contCompara+"\n"+"Total de Trocas: "+contTroca+"\n");
    }    
    
    
    public void imprimir () {
    int i, n = this.vetBubble.length;    
    for (i = 0; i < n; i++){ 
      System.out.print (this.vetBubble[i].key + " - ");  
    }System.out.print("\n");   
  } 

   
     
}
