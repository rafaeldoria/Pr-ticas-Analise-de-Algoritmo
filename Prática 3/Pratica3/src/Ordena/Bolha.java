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
public class Bolha extends Ordena{
    int contCompara=0;
    int contTroca=0;
    
    public Bolha () {
  }
    
    public Bolha (Item[] vetor) {
    this.array = vetor;
  }
    
    public void bolha () {
    int i, j, n = this.array.length;
    Item aux;    
    for (i = 0; i < n - 1; i++){
      for (j = 1; j < n - i; j++){  
        contCompara++;         
        if (array[j].key < array[j - 1].key) {
          aux = array[j];
          array[j] = array[j-1];
          array[j-1] = aux;
          contTroca++;
                }
            }
        }  
        System.out.println("\nTotal de Comparações Método Bolha: "+contCompara+"\n"+"Total de Trocas Método Bolha: "+contTroca+"\n");
    }  
    
}
