package vetoresematrizesexe2;

import java.util.Locale;
import java.util.Scanner;

public class Mediadosalunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		  scanner.useLocale(Locale.US);

	        String[] nomes = {"Junior", "Luiz", "Inacio", "Fabricio", "Giovani",
	                          "Anderson", "Wellington", "Daniel", "Miguel", "Thiago"};

	        int numeroBimestres = 4;

	        double[][] notas = new double[nomes.length][numeroBimestres];
	        double[] medias = new double[nomes.length];
	        
	        for (int indice = 0; indice < nomes.length; indice++) {
	            System.out.println("Notas do Aluno " + nomes[indice] + ":");
	            for (int j = 0; j < numeroBimestres; j++) {
	                System.out.print("Digite a nota do Bimestre " + (j + 1) + ": ");
	                notas[indice][j] = scanner.nextDouble();
	            }
	        }

	        for (int indice = 0; indice < nomes.length; indice++) {
	            double somaNotas = 0;
	            for (int j = 0; j < numeroBimestres; j++) {
	                somaNotas += notas[indice][j];
	            }
	            medias[indice] = somaNotas / numeroBimestres;
	        }

	        System.out.println("\nMédias dos Alunos:");
	        for (int indice = 0; indice < nomes.length; indice++) {
	            System.out.println( "Aluno " + nomes[indice] + ": " + medias[indice]);
	        }
	}

}
