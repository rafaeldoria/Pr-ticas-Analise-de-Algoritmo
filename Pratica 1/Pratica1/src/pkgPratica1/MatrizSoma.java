/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgPratica1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Rafael
 */
public class MatrizSoma {
    
    public int total=0;
    LinkedList totalOp = null;
    public MatrizSoma(){
        this.totalOp=new LinkedList();        
    }
    
    public static int[][] matriz (int tamanho){
        Random matRandom = new Random();
        int matriz[][]=new int[tamanho][tamanho];
        for(int i=0;i<tamanho;i++){
            for(int j=0;j<tamanho;j++){
		matriz[i][j]=matRandom.nextInt(1001);
			}
		}
        return matriz;
    }
    
    public static int cont(int matriz1[][],int matriz2[][],int tamanho){
        int matrizSoma[][] = new int [tamanho][tamanho];
        int cont=0;
            for (int i=0;i<tamanho;i++){
		for(int j=0;j<tamanho;j++){
                    matrizSoma[i][j]=matriz1[i][j]+matriz2[i][j];
                    cont++;
                    }
		}
        for(int i=0;i<tamanho;i++){
            System.out.print("\n");
		for(int j=0;j<tamanho;j++){
                    System.out.print(matrizSoma[i][j]+"-");
				}
			}
        return cont;        
    }
    
    static public void imprimi (int matriz[][],int tamanho){
	for(int i=0;i<tamanho;i++){
            System.out.print("\n");
		for(int j=0;j<tamanho;j++){
                    System.out.print(matriz[i][j]+"-");
				}
			}
                    System.out.print("\n-----------------------------------------------------\n\n");
    }
    
    
    public static void main (String[]args){
        MatrizSoma tot = new MatrizSoma();
        Random random = new Random();
	int tamanho = random.nextInt(1001);
        System.out.println(tamanho+"\n");
        int matriz1[][];
        int matriz2[][];        
        matriz1=matriz(tamanho);
        matriz2=matriz(tamanho);               
        imprimi(matriz1,tamanho);
        imprimi(matriz2,tamanho);
        //System.out.println("\n"+cont(matriz1,matriz2,tamanho));
       
        
        tot.setTotal(cont(matriz1,matriz2,tamanho));            
        MatrizSoma vai = new MatrizSoma();
        vai.lerTotalOp(tot.getTotal());
        vai.salvarTottalOp();
    }
    
    public MatrizSoma (int total) {
    this.total = total;
  }
    
     public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public void lerTotalOp(int total){
        MatrizSoma top = new MatrizSoma(total);        
        this.totalOp.add(top);
        System.out.println("\nLeitura Realizada! "+total+": total de operações!");
    }
    
    public void salvarTottalOp(){
        File arq = null;
        FileOutputStream saida = null;
        OutputStreamWriter gravador = null;
        BufferedWriter buffer_saida = null;
        
        try {      
        arq = new File ("totalopmatrizsoma.txt");
        saida = new FileOutputStream (arq);
        gravador = new OutputStreamWriter (saida, "UTF8");
        buffer_saida = new BufferedWriter (gravador);
        
        while (this.totalOp.size() > 0) {
        MatrizSoma vm = (MatrizSoma) this.totalOp.remove();
        buffer_saida.write (vm.total + "\n");
      }
        System.out.println ("Gravação concluída!");
    } catch (Exception e) {
      e.printStackTrace ();
    } finally {
      try {
        if (buffer_saida != null) 
          buffer_saida.close ();            
        if (gravador != null) 
          gravador.close ();
        if (saida != null) 
          saida.close ();
      } catch (Exception e) {
        e.printStackTrace ();
      }
    }
    }
}
