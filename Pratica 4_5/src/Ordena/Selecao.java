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
public class Selecao extends Ordena{
    int contCompara=0;
    int contTroca=0;
    
    public Selecao (Item[] vetor) {
    this.array = vetor;
  }
    
  public void selecao () {
      Item aux;
   {
	for (int fixo = 0; fixo < array.length - 1; fixo++) {
		int menor = fixo;
 
		for (int i = menor + 1; i < array.length; i++){
			if (array[i].key < array[menor].key){
				menor = i;
		}
            }
                contCompara++;
		if (menor != fixo) {
			aux = array[fixo];
                        array[fixo] = array[menor];
                        array[menor] = aux;
                        contTroca++;
		}
	}
}  
    System.out.println("\nTotal de Comparações Método Seleção: "+contCompara+"\n"+"Total de Trocas Método Seleção: "+contTroca+"\n");
  }  
}
