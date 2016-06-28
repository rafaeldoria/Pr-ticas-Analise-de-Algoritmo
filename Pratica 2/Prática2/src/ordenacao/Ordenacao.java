/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao;

    import ordenar.Ordena;
    import item.Item;      
import java.util.Random;

/**
 *
 * @author Rafael
 */
public class Ordenacao {
    
    public static void main (String[] args) {
    int i;
    Random random = new Random();
    int tamanho = random.nextInt(1001);
    
    Item[] vet = new Item[tamanho];    
    
    for (i = 0; i < tamanho; i++){        
      vet[i] = new Item (random.nextInt(1001)); 
    } 
    Ordena result = new Ordena (vet);
    
    System.out.print ("Tamanho do vetor: "+tamanho+"\n");
    
    System.out.print ("Vetor desordenado: ");
    result.imprimir ();

    result.bolha ();

    System.out.print ("Vetor ordenado: ");
    result.imprimir ();    
    
  }
}
