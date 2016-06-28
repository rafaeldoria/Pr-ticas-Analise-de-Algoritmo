/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgItem;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Menu {
     public static String Menu(){
            Scanner entrada = new Scanner(System.in);
            String option = " ";
                while(true){
                    System.out.println("Digite a opção desejada:");                    
                    System.out.println("1 - Pesquisar");
                    System.out.println("2 - Imprimir Pré Ordem");
                    System.out.println("3 - Imprimir em Ordem");
                    System.out.println("4 - Imprimir Pós Ordem");
                    System.out.println("5 - Imprimir por Nível");
                    System.out.println("6 - Altura da Árvore");
                    System.out.println("7 - Informe código para saber nível");
                    System.out.println("8 - Sair");
                    
			
                    option = entrada.nextLine();			
			if((option.compareTo("1") == 0) || (option.compareTo("2") == 0)|| (option.compareTo("3") == 0) || (option.compareTo("4") == 0) || (option.compareTo("5") == 0)|| (option.compareTo("6") == 0) || (option.compareTo("7") == 0) || (option.compareTo("8") == 0)){
				return option;		
			}else{
				System.out.println("Opçao inválida.\n");
			}
		}
	}
        
}
