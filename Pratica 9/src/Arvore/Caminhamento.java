/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arvore;
import Alunos.Alunos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import pkgItem.Item;
import pkgItem.MeuItem;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import static pkgItem.Menu.Menu;

/**
 *
 * @author Rafael
 */
public class Caminhamento {

    /**
     * @param args the command line arguments
     */
    private static ArvoreBinaria arvore;
    
    public static void main(String[] args) {
        arvore = new ArvoreBinaria(); 
        LeituraArquivo ler = new LeituraArquivo();
        ler.LerArquivo(arvore);
    }
    
}
