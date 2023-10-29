package ifsc;

import java.util.Random;

public class Desafio6 {

	public static void main(String[] args) {

		int[] numeros = new int[7];
		Random random = new Random();

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(100) + 1;
		}

		System.out.println("Array:");
		exibirArray(numeros);

		int maior = Integer.MIN_VALUE;
		int segMaior = Integer.MIN_VALUE;

		for (int num : numeros) {
			if (num > maior) {
				segMaior = maior;
				maior = num;
			} else if (num > segMaior && num != maior) {
				segMaior = num;
			}
		}

		if (segMaior != Integer.MIN_VALUE) {
			System.out.println("O segundo maior valor no array é: " + segMaior);
		} else {
		}
	}

	public static void exibirArray(int[] array) {
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
