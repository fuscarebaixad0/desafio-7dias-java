package ifsc;

import java.util.Random;

public class Desafio2 {

	public static void main(String[] args) {
		int[] numeros = new int[7];
		Random random = new Random();

		System.out.println("Array original:");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(100) + 1;
			System.out.print(numeros[i] + " ");
		}

		int soma = 0;
		for (int num : numeros) {
			soma += num;
		}

		System.out.println("\nSoma dos elementos do array: " + soma);

		int[] novoArray = new int[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			novoArray[i] = numeros[i] + soma;
		}

	}
}
