package ifsc;

import java.util.Random;

public class Desafio4 {

	public static void main(String[] args) {

		int[] array1 = new int[7];
		int[] array2 = new int[7];
		Random random = new Random();

		for (int i = 0; i < 7; i++) {
			array1[i] = random.nextInt(100) + 1;
			array2[i] = random.nextInt(100) + 1;
		}

		System.out.println("Array 1:");
		exibirArray(array1);

		System.out.println("Array 2:");
		exibirArray(array2);

		System.out.println("Elementos em comum:");
		encontrarElementosComum(array1, array2);
	}

	public static void exibirArray(int[] array) {
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void encontrarElementosComum(int[] array1, int[] array2) {
		for (int num1 : array1) {
			for (int num2 : array2) {
				if (num1 == num2) {
					System.out.print(num1 + " ");
					break;
				}
			}
		}
		System.out.println();
	}
}
