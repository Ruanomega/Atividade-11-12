package vetoresematrizesexer1;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		int[] vetor = new int [10];
		
		for(int indice =0; indice < 10; indice++) {
			System.out.println("Digíte o Número " + (indice + 1) + ":");
			vetor[indice] = scanner.nextInt();
			}
		
		System.out.println("Elementos ímpares");
		for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.print(vetor[i] + " ");
            }
        }

		
		System.out.println("\nElementos pares do vetor:");
        for (int num : vetor) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        
        int soma = 0;
        for (int num : vetor) {
            soma += num;
        }
        System.out.println("\nSoma de todos os elementos do vetor: " + soma);
        
        double media = (double) soma / 10;
        System.out.println("Média de todos os elementos do vetor: " + media);


		}

}
