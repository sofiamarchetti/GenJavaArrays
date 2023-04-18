package Arrays;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int vetor[] = {2,5,1,3,4,9,7,8,10,6};
        int num, i;
        boolean found = false;

        System.out.println("Digite o número que você deseja encontrar: ");
        num = leia.nextInt();

        for (i=0; i<10; i++) {
            if (vetor[i] == num) {
                found = true;
                break;
            }

        }

        if (found) {
            System.out.println("O número "+ num + " está localizado na posição " + i);
        }else {
            System.out.println("O número "+ num + " não foi encontrado!" );
        }

}
}