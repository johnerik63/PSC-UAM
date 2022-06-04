package uam;

import java.util.Scanner;

public class SequenciaWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();

        int contador = 1;

        while(contador <= numero){

            /*System.out.print( (int)Math.pow(2,contador) + " ");
            contador++; */

            System.out.print(contador);

            contador = contador * 2;
        }

    }
}
