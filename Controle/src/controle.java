package uam;

import java.util.Scanner;

public class controle {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int resposta = 1;

        while(resposta == 1){
            System.out.println("Digite o seu nome: ");
            String nome = entrada.next();
            System.out.println("Digite a sua idade: ");
            int idade = entrada.nextInt();

            if (idade >= 18) {
                System.out.println(nome);

                System.out.println("Voce deseja continuar? 1/0");
                resposta = entrada.nextInt();
            }

        }

    }

}
