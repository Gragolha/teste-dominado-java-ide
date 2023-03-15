package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {

	
		Livros livros = new Livros();
		Gato gato = new Gato();
		
		
		
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
