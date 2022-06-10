package uam;

public class MetodoSemRetorno {

    public static void main(String[] args) {

        System.out.println("Antes de chamar a funcao");
        imprimirInformacoes("Programacao", 10);
        System.out.println("Depois de chamar a funcao");
        imprimirInformacoes("Modelagem", 5);
    }

    public static  void imprimirInformacoes(String texto, int numero) {
        System.out.println("Aula de " + texto);
        System.out.println("Aprendendo logica de programacao");
        System.out.println("Programar eh muito legal");
        System.out.println(numero * 2);
    }

}
