package Arvore;

import Arvore.No;
import java.util.LinkedList;
import pkgItem.Item; 
import pkgItem.MeuItem;

public class ArvoreBinaria {
  private No raiz; 
  public int tamanho=0; 
  LinkedList lista = new LinkedList(); 
  public int nivel=0;  
     
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
    }
    else if (reg.compara (p.reg) < 0) {       
      p.esq = insere (reg, p.esq);      
      
    }
    else if (reg.compara (p.reg) > 0){          
      p.dir = insere (reg, p.dir);
    }
    else{ 
        System.out.println ("Erro: Registro ja existente");          
        }
    return p;   
    
  }
  
  public Item pesquisa (Item reg) {
    return this.pesquisa (reg, this.raiz); 
    
  }
  
  private Item pesquisa (Item reg, No p) {
    
    if (p == null){
      return null; //Registro não econtrado.     
    }
    else if (reg.compara (p.reg) < 0){
        return pesquisa (reg, p.esq);
    }
    else if (reg.compara (p.reg) > 0){
        return pesquisa (reg, p.dir);
    }else{ 
        return p.reg;
    }
  }
     
  public void retira (Item reg) {
    this.raiz = this.retira (reg, this.raiz);
  }
  
  private No retira (Item reg, No p) {
    if (p == null){ 
      System.out.println ("Erro: Registro nao encontrado");      
    }
    else if (reg.compara (p.reg) < 0) {
      p.esq = retira (reg, p.esq);
    }
    else if (reg.compara (p.reg) > 0) {
      p.dir = retira (reg, p.dir);
    }
    else if (p.dir == null) {          
      p = p.esq;
    }
    else if (p.esq == null){ 
      p = p.dir;}
    else {
      p.esq = antecessor (p, p.esq);       
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
  
  public void imprime (int ordem) {
    if(ordem == 1){
    this.centralPreOrdem (this.raiz);
    }
    if(ordem == 2){
    this.centralOrdem (this.raiz);
    }
    if(ordem == 3){
    this.centralPreOrdem (this.raiz);
    }    
    if(ordem == 4){
    lista.clear();
    this.centralNivel (this.raiz);
    } 
  }  
  
  private void centralNivel(No p){
    if(p != null){
      lista.add((No)p);                 
      while(lista.isEmpty() != true){
        p = (No) lista.getFirst();
        System.out.println(p.reg.toString());
        p.reg.toChave();        
        lista.removeFirst();
        if(p.esq != null){
            lista.add(p.esq);
        }                
        if(p.dir != null){
            lista.add(p.dir);
        }
      }
    }    
  }
  
  private void centralPreOrdem (No p) {
    if (p != null) {
      System.out.println (p.reg.toString());   
      centralPreOrdem (p.esq);           
      centralPreOrdem (p.dir);       
    }
  }

  private void centralOrdem (No p) {
    if (p != null) {
      centralOrdem (p.esq);
      System.out.println (p.reg.toString());      
      centralOrdem (p.dir);       
    }
  }
  
  private void centralPosOrdem (No p) {
    if (p != null) {
      centralPosOrdem (p.esq);          
      centralPosOrdem (p.dir); 
      System.out.println (p.reg.toString()); 
    }
  }
  
  public void alturaArvore(){
    System.out.println("\nAltura da arvore : " + this.getAltura(this.raiz)+"\n");    
  }
    
  private int getAltura(No p){
    if(p == null){
      return 0;
    }
    int ladoL = getAltura(p.esq);
    int ladoR = getAltura(p.dir);
    
    if(ladoL > ladoR){
      return ladoL + 1;
    }
    else {
       return ladoR + 1;
    }
  }
  
  public Item pesquisaNivel (Item reg) {     
    return this.pesquisaNivel (reg, this.raiz );     
  }
  
  private Item pesquisaNivel (Item reg, No p) {
    
    if (p == null){
      return null; //Registro não econtrado.     
    }
    else if (reg.compara (p.reg) < 0){ 
        setNivel(getNivel() + 1);
        return pesquisa (reg, p.esq);
    }
    else if (reg.compara (p.reg) > 0){
        setNivel(getNivel() + 1);
        return pesquisa (reg, p.dir);
    }else{
        setNivel(getNivel() + 1); 
        return p.reg;        
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
  
  public void tamanho (){
      int tam=this.tamanho;     
      System.out.println("Tamanho da árvore: "+tam+"\n");
  }  

    public int getNivel() {        
        return nivel;        
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;        
    }
 
  
}

