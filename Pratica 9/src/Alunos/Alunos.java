/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alunos;
import java.util.Random;

/**
 *
 * @author Rafael
 */
public class Alunos {
    
    private int codigo;
    private String nomeAluno;
    private String data;
    private int nota;    
    
    public Alunos(int codigo, String nomeAluno, String data, int nota){
		this.codigo = codigo;
		this.nomeAluno = nomeAluno;
		this.data = data;
		this.nota = nota;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNome(String nome) {
		this.nomeAluno = nomeAluno;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
    
}
