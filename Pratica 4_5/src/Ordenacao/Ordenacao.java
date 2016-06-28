/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenacao;

import Ordena.Bolha;
import Item.Item;   
import Ordena.Selecao;
import Ordena.Insercao;
import Ordena.QuickSort;
import java.util.Random;

/**
 *
 * @author Rafael
 */
public class Ordenacao {
    
    public static void main (String[] args) {
        Random random = new Random();
        int tamanho = random.nextInt(1001);
        Ordenacao ordenar = new Ordenacao ();
        ordenar.OrdenaBolha(tamanho);
        ordenar.ordenaSelecao(tamanho);
        ordenar.ordenaInsercao(tamanho);
        ordenar.ordenaQuickSort(tamanho);
        }  
    
   // METODO BOLHA
    public void OrdenaBolha(int tamanho){
    int i;    
    Random random = new Random();    
    Item[] vet = new Item[tamanho];    
    
    for (i = 0; i < tamanho; i++){        
      vet[i] = new Item (random.nextInt(1001)); 
    } 
    Bolha result = new Bolha (vet);
    
    System.out.println ("-------------- Método de Bolha -------------");
    System.out.println ("Tamanho do vetor: "+tamanho+"\n");
    
    System.out.println ("Vetor desordenado: ");
    result.imprimir ();

    result.bolha();

    System.out.print ("Vetor ordenado: ");
    result.imprimir ();    
    System.out.println ("---------------------------------------------\n");
    
  }
    
    //METODO SELEÇÃO
    public void ordenaSelecao (int tamanho) {
    int i;
    Random random = new Random();
    Item[] vet = new Item[tamanho];
    
    for (i = 0; i < tamanho; i++)
      vet[i] = new Item (random.nextInt(1001)); 
      
    Selecao result = new Selecao (vet);
    
    System.out.println ("-------------- Método de Selecao -------------");
    System.out.println ("Tamanho do vetor: "+tamanho+"\n");
    System.out.println ("Vetor desordenado: ");
    result.imprimir();

    result.selecao();

    System.out.println ("Vetor ordenado: ");
    result.imprimir ();
    System.out.println ("---------------------------------------------\n");
  }
    
    //METODO INSERÇÃO
    public void ordenaInsercao (int tamanho){
    int i;
    Random random = new Random();
    Item []vet = new Item[tamanho];
            
    for (i = 0; i < tamanho; i++)
      vet[i] = new Item (random.nextInt(1001));    
    
    Insercao result = new Insercao (vet);
    
    System.out.println ("-------------- Método de Inserção -------------");
    System.out.println ("Tamanho do vetor: "+tamanho+"\n");
    System.out.println ("Vetor desordenado: ");
    result.imprimir();

    result.insercao();
            
    System.out.println ("Vetor ordenado: ");
    result.imprimir ();
    System.out.println ("---------------------------------------------\n");
    }
    
    //METODO QUICKSORT
    public void ordenaQuickSort (int tamanho){
    int i;
    Random random = new Random();
    Item []vet = new Item[tamanho];
            
    for (i = 0; i < tamanho; i++)
      vet[i] = new Item (random.nextInt(1001));    
    
    QuickSort result = new QuickSort (vet);
    
    System.out.println ("-------------- Método QuickSort -------------");
    System.out.println ("Tamanho do vetor: "+tamanho+"\n");
    System.out.println ("Vetor desordenado: ");
    result.imprimir();

    result.quicksort();
            
    System.out.println ("Vetor ordenado: ");
    result.imprimir ();
    System.out.println ("---------------------------------------------\n");
    }
}

