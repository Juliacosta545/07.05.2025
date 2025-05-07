package Desafios;

import java.util.Scanner;

public class VetorAeVetorB {
	public static void main(String[] args) {
		int vetorA [] = new int [5];
		int vetorB [] = new int [5];
		int vetorC [] = new int [10];
		
		Scanner ler = new Scanner(System.in);
		
		for ( int i =0; i<5; i++);
		System.out.println("Unforme um valor do (vetorA)" + i + "..:");
		vetorA [i] = ler.nextInt();
		
		for ( int i =0; i<5; i++);
		System.out.println("Unforme um valor do (vetorA)" + i + "..:");
		vetorA [i] = ler.nextInt();
		
		for (int i = 0; i<5; i++) {
			vetorC[i] = vetorA [i];
			vetorC[i + 5] = vetorB[i];
			}
			for (int valor : vetorC) {
			System.out.println(valor);
			}
				
	}

}
