package uam;

import java.util.Scanner;

public class desafio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("numeros pares");
        for (int i = 0; i < 10; i++) {
            int resto = numeros[i] % 2;
            if(resto == 0) {
                System.out.println(numeros[i] + " ");
            }

        }

        System.out.println("numeros impares");
        for (int i = 0; i < 10; i++){
            int resto = numeros[i] % 2;
            if(resto!= 0){
                System.out.println(numeros[i] + " ");
            }
        }
    }
}