package Desafios;

import java.util.Scanner;

public class ValorIntero {
	public static void main(String[] args) {
			int vetor  [] = new int[5];
			int soma;
			
			Scanner ler = new Scanner (System.in);
			//ENTRADA DE DADOS 
			for (int i =0; i<5; i++) {
				System.out.println("Informe o numero " + i+ " ..:");
				vetor [i] = ler.nextInt();
				
			}
			//SAÍDA DE DADOS 
			soma = vetor[0] + vetor[1] + vetor[2] + vetor[3] + vetor[4];
			
					if (soma > 30) {
						System.out.println("A soma dos valores é: " + soma);
						
			}
					else {
						System.out.println("A soma é menos que 30");
					}
			ler.close();
	}

}
