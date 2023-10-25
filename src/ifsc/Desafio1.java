package ifsc;

import java.util.Random;

public class Desafio1 {
    public static void main(String[] args) {
        
        int[] nume = new int[7];
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            nume[i] = random.nextInt(100) + 1; 
        }

        System.out.println("Array original:");
        for (int num : nume) {
            System.out.print(num + " ");
        }
        System.out.println();

        int elementoRemover = nume[0];
        int[] novoArray = new int[6];
        int newIndex = 0;
        for (int i = 0; i < 7; i++) {
            if (nume[i] != elementoRemover) {
                novoArray[newIndex] = nume[i];
                newIndex++;
            }
        }

        System.out.println("Novo array: ");
        for (int num : novoArray) {
            System.out.print(num + " ");
        }
    }
}

