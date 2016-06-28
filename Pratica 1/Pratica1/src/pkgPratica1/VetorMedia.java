/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgPratica1;

import java.util.Random;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

/**
 *
 * @author Rafael
 */
public class VetorMedia {
    public int total=0;
    LinkedList totalOp = null;
    
    public VetorMedia(){
        this.totalOp=new LinkedList();        
    }
    
    static public int soma(int vetor[]){
        int soma=0;
        int cont=0;
        for(int i=0;i<5;i++){
            cont++;
            soma+=vetor[i]; 
        }        
        System.out.print("Média 5 primeiros: "+soma+"\n");
        return cont;
    }
    
    public static void main(String[] args){
            VetorMedia tot = new VetorMedia();
            int tamanho;
            do{
            Random random = new Random();
            tamanho = random.nextInt(1000001);
            }while(tamanho<5);
            System.out.println(tamanho+"\n");
            Random vetRandom = new Random();
            int vetorTeste [] = new int [tamanho];		
		for(int i=0;i<tamanho;i++){
			vetorTeste[i]= vetRandom.nextInt(1000001);			
		}
            tot.setTotal(soma(vetorTeste));            
            VetorMedia vai = new VetorMedia();
            vai.lerTotalOp(tot.getTotal());
            vai.salvarTottalOp();
          
    }
    
  public VetorMedia (int total) {
    this.total = total;
  }
    
     public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
   
    public void lerTotalOp(int total){
        VetorMedia top = new VetorMedia(total);        
        this.totalOp.add(top);
        System.out.println("Leitura Realizada! "+total+": total de operações!");
    }      

    public void salvarTottalOp(){
        File arq = null;
        FileOutputStream saida = null;
        OutputStreamWriter gravador = null;
        BufferedWriter buffer_saida = null;
        
        try {      
        arq = new File ("totalopvetormedia.txt");
        saida = new FileOutputStream (arq);
        gravador = new OutputStreamWriter (saida, "UTF8");
        buffer_saida = new BufferedWriter (gravador);
        
        while (this.totalOp.size() > 0) {
        VetorMedia vm = (VetorMedia) this.totalOp.remove();
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
