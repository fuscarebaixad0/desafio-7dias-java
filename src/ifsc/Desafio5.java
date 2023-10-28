package ifsc;

import java.util.Random;

public class Desafio5 {
	public static void main(String[] args) {
		int[] numeros = new int[7];
		Random random = new Random();

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(100) + 1;
		}

		System.out.println("Array:");
		exibirArray(numeros);

		int valorAleatorio = random.nextInt(100) + 1;
		System.out.println("Valor gerado aleatóriamente: " + valorAleatorio);

		boolean encontrado = false;
		for (int num : numeros) {
			if (num == valorAleatorio) {
				encontrado = true;
				break;
			}
		}

		if (encontrado) {
			System.out.println("O valor está presente no array.");
		} else {
			System.out.println("O valor não está presente no array.");
		}
	}

	public static void exibirArray(int[] array) {
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
