package uam;

public class Acumulador {

    public static void main(String[] args) {

        int contador = 0;
        int acumulador = 0;

        while(contador <= 5){
            acumulador = acumulador + contador;
            contador++;
        }

        System.out.println(acumulador);

    }
}
