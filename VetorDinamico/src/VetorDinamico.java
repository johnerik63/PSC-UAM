package uam;

import java.util.Scanner;

public class VetorDinamico {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quantos elementos vc deseja armazenar:");
        int tamanho= entrada.nextInt();
        int[] numeros = new int[tamanho];

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite um valor: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Tamanho do vetor");
        System.out.println(numeros.length);

        System.out.println("imprimindo os elementos");

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}
