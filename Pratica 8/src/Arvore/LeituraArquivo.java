/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arvore;

import Alunos.Alunos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import pkgItem.Item;
import static pkgItem.Menu.Menu;
import pkgItem.MeuItem;

/**
 *
 * @author Rafael
 */
public class LeituraArquivo {
    
    
	String arquivo[] = new String[3];        		
	Alunos aluno;                       
        public void LerArquivo(ArvoreBinaria arvore){
            try {
			
		FileReader arq = new FileReader("alunos.txt");
		BufferedReader  lerarq = new BufferedReader(arq);			
		String linha =  lerarq.readLine();			
                    while(linha != null){				
			arquivo = linha.split(";");
			aluno = new Alunos( Integer.parseInt(arquivo[0]),
                                                            arquivo[1],
                                                            arquivo[2],
                                                            Integer.parseInt(arquivo[3]));				
			Item item = new pkgItem.MeuItem(aluno.getCodigo(), aluno);
			arvore.insere(item);				
			linha = lerarq.readLine();				
			}		
			arq.close();
                     
                        String option = " ";			
			Scanner entrada = new Scanner(System.in);			
			while(option.compareTo("3") != 0){
                                option = Menu();
                            if(option.compareTo("1") == 0){
                                System.out.println("\nDigite o código:");								
                                String codigo = entrada.nextLine();									
                                Item retornoPesquisa = arvore.pesquisa(new MeuItem(Integer.parseInt(codigo)));
					
                                    if(retornoPesquisa == null){
                                            System.out.println("\nCódigo inválido\n");					
					}else{
                                            System.out.println("\nCódigo encontrado.");
                                            System.out.println(retornoPesquisa.toString());
					}					
					
                            }else if(option.compareTo("2") == 0){
					System.out.println("\nDigite o código:");					
					String codigo = entrada.nextLine();									
					arvore.retira(new MeuItem(Integer.parseInt(codigo)));					
					System.out.println("\nAluno excluído.\n");			
                            }else if(option.compareTo("3") == 0){
					System.out.println("\nPrograma encerrado.");                                        
				}
			}			
			entrada.close();                
                        			
            } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.printf(" Erro na abertura do arquivo: % a.\n", e.getMessage());
            }
        }
}
