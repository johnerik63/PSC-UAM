package uam;

import java.util.Scanner;

public class ExemploNotas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //double nota = 0;

        double[] nomes = new double[5];

       /* nomes[0] = 8.5;
        nomes[1] = 7;
        nomes[2] = 7.5;
        nomes[3] = 8.0;
        nomes[4] = 10;

        System.out.println(nomes[3]);
        System.out.println(nomes[1]);

        nomes[3] = 9.5;

        System.out.println(nomes[3]);
        System.out.println(nomes[1]); */

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite uma nota: ");
            nomes[i] = entrada.nextDouble();

        }

        System.out.println("imprimindo os dados do vetor");

        for(int i = 0; i < 5; i++){
            System.out.println(nomes[i]);
        }

        //System.out.println(nota);

    }
}
