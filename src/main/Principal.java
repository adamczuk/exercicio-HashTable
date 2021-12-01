package main;

import controller.HashTableController;

public class Principal {

	public static void main(String[] args) {

	HashTableController htCont = new HashTableController();
	
	htCont.adicionarCliente("NATHAN", 123456, 222345, 11976560);
	htCont.adicionarCliente("ZEZINHO", 1234, 223324, 1134633);
	htCont.visualizarCliente("NATHAN");
	System.out.println();
	htCont.visualizarCliente("ZEZINHO");
	}

}