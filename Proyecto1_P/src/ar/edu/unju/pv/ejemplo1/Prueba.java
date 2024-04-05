package ar.edu.unju.pv.ejemplo1;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int anio = 2028;
		String saludo ="Hola Pv";
		System.out.println(saludo + " " + anio);
		
		if(anio <= 2024 ) {
			System.out.println("Año correcto");
		}else {
			System.out.println("Año Incorrecto	");
		}
		int tamanio = saludo.length();
		for(int i= 0; i<tamanio; i++) {
			System.out.println(saludo.charAt(i));
		}
		
		int indice = 0;
		
		while(indice < tamanio) {
			System.out.println(saludo.charAt(indice));
			indice++;
		}
		
		System.out.println("Ingrese un nombre");
		String nombre = teclado.next();
		System.out.println("Hola: "+ nombre);
	}

}
