package uam;

import java.util.Scanner;

public class RelembrandoCondicional {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");

        int idade;

        idade = entrada.nextInt();

        if(idade >= 18) {
            System.out.println("Voce ja eh maior de idade.");

        }else{
            System.out.println("Voce eh menor de idade.");
        }
    }
}
