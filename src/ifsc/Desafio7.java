package ifsc;

import java.util.Random;

public class Desafio7 {
	public static void main(String[] args) {

		int[] numeros = new int[7];
		Random random = new Random();

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(100) + 1;
		}

		System.out.println("Array:");
		exibirArray(numeros);

		int maior = numeros[0];
		int menor = numeros[0];

		for (int num : numeros) {
			if (num > maior) {
				maior = num;
			}
			if (num < menor) {
				menor = num;
			}
		}

		System.out.println("Maior valor: " + maior);
		System.out.println("Menor valor: " + menor);
	}

	public static void exibirArray(int[] array) {
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}
