package uam;

public class DeclarandoVetor {

    public static void main(String[] args) {

        int[] numeros = new int[]{789, 345, 654, 2, 23};
        int max = 0;

        for(int i = 0; i < 5; i++) {
            if(numeros[i] > max){
                max = numeros[i];
            }
        }
        System.out.println(max);
    }

}
