/*
 * Uma empresa precisa de um programa de computador que efetue o cadastro de compradores
 * Os compradores deverão ser alocados e recuperados rapidamente da memória. 
 * Crie o programa para esta empresa, alocando os “Compradores” em uma hash table
 * utilizando a Api do java.
 * 
 * Use sua criatividade para escolher os componentes que serão utilizados para
 * construir a Hash Table
 * 
 * A chave hash deverá ser composta pelo NOME;
 * 
 * Cada comprador tem os seguintes dados:Nome; RG; CPF; Telefone
 */

package controller;

import java.util.Hashtable;

public class HashTableController {
	
	Hashtable<String, Comprador> hTable = new Hashtable<String, Comprador>();
	
	public void adicionarCliente(String nome, int rg, int cpf, int telefone) {
		Comprador novoComprador = new Comprador(nome, rg, cpf, telefone);
		
		hTable.put(nome, novoComprador);
	}
	
	public void visualizarCliente (String chave) {
		Comprador comprador = hTable.get(chave);
		
		String nome = comprador.getNome();
		int cpf = comprador.getcpf();
		int rg = comprador.getRg();
		int telefone = comprador.getTelefone();
		
		System.out.println("NOME: " + nome + "\nCPF: "+ cpf + "\nRG: "+  rg + "\nTELEFONE: " + telefone);
				
	}

}
