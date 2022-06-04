package uam;

public class Repeticao {

    public static void main(String[] args) {

        int contador = 1;

        while (contador <= 100) {

            //imprimir de 1 a 100
            System.out.println(contador);
            /*contador = contador + 1;
                     ou */
            contador++;

            //numeros impares
            while (contador <= 10) {

                System.out.println(contador);
                contador = contador + 2;

                //numeros pares
                while (contador <= 0) {

                    System.out.println(contador);
                    contador = contador + 2;

                }

            }
        }
    }
}