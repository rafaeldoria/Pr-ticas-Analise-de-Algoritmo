/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica7;

import java.util.Random;

/**
 *
 * @author Rafael
 */
public class UniversalSink {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Random random = new Random();
    int tam = random.nextInt(101);
    
    int matriz [][] = new int [tam][tam];
    
	for(int i=0;i<tam;i++){
            for(int j=0;j<tam;j++){
                int num = random.nextInt(2);
                matriz[i][j]=num;
            }
        }
    for(int i=0;i<tam;i++){
        System.out.print("\n");
        for(int j=0;j<tam;j++){
            System.out.print(matriz[i][j]);
        }
    }
    boolean sink = false;
    int i = 0;
    int j = 0;
    int cont=0;
    int cand=0;
    while(i <tam && j <tam){
        if (matriz[i][j]==0){
            j=j+1;
        }else{
            cand=j;
            i=i+1;
        }
        if (i>tam){
            sink = false;
        }
        for(int k=0;k<tam;k++){
            if(matriz[k][cand]==1){
                cont=cont+1;
            }
        }
        if(cont==(tam-1)){
            sink=true;
        }
        }     
        if(sink==true){
        System.out.println("Grafo possui vértice sorvedouro universal.");
        }else{
        System.out.println("Grafo não possui vértice sorvedouro universal.");    
        }
    }    
}
