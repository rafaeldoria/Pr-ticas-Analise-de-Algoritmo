package Arvore;

import Arvore.No;
import pkgItem.Item; 
import pkgItem.MeuItem;

public class ArvoreBinaria {
  private No raiz;
  public int operaInsercao=0;
  public int operaRemocao=0;
  public int operaPesquisa=0;
  public int tamanho=0;
     
  public ArvoreBinaria () {
    this.raiz = null;
  }
  
  public void insere (Item reg) {
    this.raiz = this.insere (reg, this.raiz);
    tamanho++;
  }
  
  private No insere (Item reg, No p) {
      
    if (p == null) {
      p = new No (); 
      p.reg = reg; 
      p.esq = null; 
      p.dir = null;
      operaInsercao+=1;
      
    }
    else if (reg.compara (p.reg) < 0) {       
      p.esq = insere (reg, p.esq);
      operaInsercao+=1;
      
    }
    else if (reg.compara (p.reg) > 0){          
      p.dir = insere (reg, p.dir);
      operaInsercao+=1;    
    }
    else{
        operaInsercao+=1;    
        System.out.println ("Erro: Registro ja existente");          
        }
    return p;   
    
  }
  
  public Item pesquisa (Item reg) {
    return this.pesquisa (reg, this.raiz); 
    
  }
  
  private Item pesquisa (Item reg, No p) {
    
    if (p == null){ 
        operaPesquisa+=1;
      return null; //Registro não econtrado.     
    }
    else if (reg.compara (p.reg) < 0){
        operaPesquisa+=1;
        return pesquisa (reg, p.esq);
    }
    else if (reg.compara (p.reg) > 0){
        operaPesquisa+=1;
        return pesquisa (reg, p.dir);
    }else{ 
        operaPesquisa+=1;
        return p.reg;
    }
  }
     
  public void retira (Item reg) {
    this.raiz = this.retira (reg, this.raiz);
  }
  
  private No retira (Item reg, No p) {
    if (p == null){ 
      operaRemocao+=1;
      System.out.println ("Erro: Registro nao encontrado");      
    }
    else if (reg.compara (p.reg) < 0) {
      p.esq = retira (reg, p.esq);
      operaRemocao+=1;
    }
    else if (reg.compara (p.reg) > 0) {
      p.dir = retira (reg, p.dir);
      operaRemocao+=1;
    }
    else if (p.dir == null) {          
      p = p.esq;
      operaRemocao+=1;}
    else if (p.esq == null){ 
      p = p.dir;
     operaRemocao+=1;;}
    else {
      p.esq = antecessor (p, p.esq); 
      operaRemocao+=1;
        }
    return p; 
  }
     
  private No antecessor (No q, No r) {
    if (r.dir != null) 
      r.dir = antecessor (q, r.dir);
    else { 
      q.reg = r.reg; 
      r = r.esq; 
    }
    return r;
  }
  
  public void imprime () {
    this.central (this.raiz);
  }

  private void central (No p) {
    if (p != null) {
      central (p.esq);
      System.out.println (p.reg.toString());      
      central (p.dir);       
    }
  }
  
  public String centralSalva()
  {
      return this.centralSalva(this.raiz);
  }
  
  private String centralSalva (No p) {      
    StringBuilder registro = new StringBuilder();      
    if (p != null)
    {
      registro.append(this.centralSalva(p.esq));
      registro.append(System.getProperty("line.separator")).append(p.reg.toString());
      registro.append(this.centralSalva(p.dir));         
    }    
    return registro.toString();    
  }
    
 
  //Método para testar o funcionamento da classe.
  public void testa () { 
    this.testa (this.raiz);
  }
  
  //Método para testar o funcionamento da classe.
  private void testa (No p) { 
    if (p == null) 
      return;
    if (p.esq != null) { 
      if (p.reg.compara (p.esq.reg) < 0) { 
        System.out.println ("Erro: Pai " + p.reg.toString() + " menor que filho a esquerda " + p.esq.reg.toString());
        System.exit (1);
      }
    }
    if (p.dir != null) { 
      if (p.reg.compara (p.dir.reg) > 0 ) { 
        System.out.println ("Erro: Pai " + p.reg.toString() + " maior que filho a direita " + p.dir.reg.toString());
        System.exit (1);
      }
    }
    testa(p.esq);
    testa(p.dir);
  }  
  
  public void mostra (){
      int tam=this.tamanho;
      int inseri=this.operaInsercao;
      int retira=this.operaRemocao;
      int pesquisa=this.operaPesquisa;    
      
      System.out.println("Tamanho da árvore: "+tam+"\n"
                        +"Total de operações de inserção: "+inseri+"\n"
                        +"Total de operações de remoção: "+retira+"\n"
                        +"Total de operações de pesquisa: "+pesquisa+"\n");
  }  
 
  
}
