package uam;

import java.util.Scanner;

public class desafio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um nome: ");
            nomes[i] = entrada.next();

        }

        System.out.println("imprimindo o conteudo do vetor");

        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i]);
        }
    }
}
