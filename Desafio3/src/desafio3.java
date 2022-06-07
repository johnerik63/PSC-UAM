package uam;

import java.util.Scanner;

public class desafio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = entrada.nextInt();

        }
        System.out.println("imprimindo o conteudo do vetor");

        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
    }
}
