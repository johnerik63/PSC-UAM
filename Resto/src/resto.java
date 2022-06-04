package uam;

public class resto {

    public static void main(String[] args) {

        int contador = 0;

        while (contador <= 10) {

            int resto = contador % 2;

            if (resto == 0) {

                System.out.println(contador);
            }
                //contador = contador + 1;
                contador++;
            }
        }
    }