package uam;

import java.util.Scanner;

public class desafio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        double acumuladorNotas = 0;

        while (contador < 5) {
            System.out.println("Digite a nota do aluno: ");
            double nota = entrada.nextDouble();
            acumuladorNotas = acumuladorNotas + nota;
            contador++;
        }

        System.out.println("media");
        System.out.println(acumuladorNotas/5);
    }
}
