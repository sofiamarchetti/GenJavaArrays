package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int num = 0, i;

        //Mostra todos os elementos do vetor armazenado
        System.out.println("Vetor armazenado: " + Arrays.toString(vetor));

        // Mostra todos os elementos dos índices ímpares do vetor
        System.out.println("Elementos dos índices ímpares do vetor: ");
        for (i = 1; i < 10; i += 2) System.out.println(vetor[i] + " ");

        // Mostra todos os elementos do vetor que são números pares
        System.out.println("Números pares:");
        for (i = 0; i < 10; i++)
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        System.out.println();

        // Calcula a soma de todos os elementos do vetor
        int soma = 0;
        for (i = 0; i < 10; i++) soma += vetor[i];

        // Calcula a média dos elementos do vetor
        double media = (double) soma / 10;

        System.out.println("Soma de todos os elementos: " + soma);
        System.out.println("Média de todos os elementos: " + media);

        leia.close();
    }
}