package com.senati.eti;

import java.util.Scanner;

import com.senati.eti.model.Calculadora2;
public class caso2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Numero 1: ");
		float n1 = sc.nextFloat();
		System.out.println("Numero 2: ");
		float n2 = sc.nextFloat();
		
		Calculadora2 calc = new Calculadora2(n1,n2);
		
		System.out.println("\n ** NUMEROS INGRESADOS ** ");
		System.out.println("--------------------------");
		System.out.println("Primero numero...........: " + calc.getNumero1());
		System.out.println("segundo numero...........: " + calc.getNumero2());
		
		System.out.println("\n ** RESULTADOS ** ");
		System.out.println("-------------------");
		System.out.println("1. Suma............: " + calc.Operar(1));
		System.out.println("2. Resta...........: " + calc.Operar(2));
		System.out.println("3. Producto........: " + calc.Operar(3));
		System.out.println("4. Division........: " + calc.Operar(4));
		System.out.println("5. Resto Entero....: " + calc.Operar(5));
		System.out.println("5. Promedio........: " + calc.Operar(6));
		System.out.println("5. Suma de cuadrados....: " + calc.Operar(7));
		System.out.println("5. Diferencia Porcentual....: " + calc.Operar(8));

	}

}
