package com.dio;

import com.dio.model.gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {

	
		Livros livros = new Livros();
		gato Gato = new gato();
		
		
		
		System.out.println(livros);
		System.out.println(gato);

		/*
		 * int a = 2; int b = 3;
		 * 
		 * System.out.println( a + b);
		 */

	}

}

class Livros {
	private String Nome;
	private String npag;
}
