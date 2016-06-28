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
public class VetorMaior {
    
    public int total=0;
    LinkedList totalOp = null;
    
    public VetorMaior(){
        this.totalOp=new LinkedList();        
    }
    
   static public int[] vetor(int tamanho){
		int vetorTeste[]=new int[tamanho];
		Random vetRandom = new Random();
		for(int i=0;i<tamanho;i++){
			vetorTeste[i]= vetRandom.nextInt(1000001);			
		}			
		return vetorTeste;
	}
	
	
	static public int cont(int vetor[],int tamanho){
		int maior = -1;	
		int contMaior = 0;
		for(int i=0;i<tamanho;i++){			
			if(maior<vetor[i]){
				contMaior++;
				maior=vetor[i];
			}
		}
		System.out.print(maior+"\n");
		return contMaior;
		
	}		
	
        public static void main (String[]args){
            VetorMaior tot = new VetorMaior();
            Random random = new Random();
            int tamanho = random.nextInt(1000001);
            int exe = 0;
            
            System.out.println(tamanho+"\n");            
            tot.setTotal(cont(vetor(tamanho),tamanho));            
            VetorMaior vai = new VetorMaior();
            vai.lerTotalOp(tot.getTotal());
            vai.salvarTottalOp();
            exe++;
                        
        }
        
    public VetorMaior (int total) {
    this.total = total;
  }
    
     public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public void lerTotalOp(int total){
        VetorMaior top = new VetorMaior(total);        
        this.totalOp.add(top);
        System.out.println("Leitura Realizada! "+total+": total de operações!");
    }    
    
    public void salvarTottalOp(){
        File arq = null;
        FileOutputStream saida = null;
        OutputStreamWriter gravador = null;
        BufferedWriter buffer_saida = null;
        
        try {      
        arq = new File ("totalopvetormaior.txt");
        saida = new FileOutputStream (arq);
        gravador = new OutputStreamWriter (saida, "UTF8");
        buffer_saida = new BufferedWriter (gravador);
        
        while (this.totalOp.size() > 0) {
        VetorMaior vm = (VetorMaior) this.totalOp.remove();
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
