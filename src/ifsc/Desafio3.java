package ifsc;

import java.util.Random;

public class Desafio3 {
	public static void main(String[] args) {

		int[] numeros = new int[7];
		Random random = new Random();

		System.out.println("Array:");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(100) + 1;
			System.out.print(numeros[i] + " ");
		}

		int soma = 0;
		for (int num : numeros) {
			soma += num;
		}

		double media = (double)soma/numeros.length;
		System.out.println("Média: " + media);
	}

}
