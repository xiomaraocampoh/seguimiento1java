package OperadorComparacion;

public class Main {
    public static void main(String[] args) {
        ComparacionIgual comparar = new ComparacionIgual();
        comparar.numero_string = 112;
        comparar.numero_int = 112;
        System.out.println(comparar.mensaje());


        ComparacionMenorque diferenciar = new ComparacionMenorque();

        diferenciar.numero1 = 111;
        diferenciar.numero2 = 111;

        System.out.println(diferenciar.mensaje());


        Menor_Mayor menor = new Menor_Mayor();

        menor.numero1 = 121;
        menor.numero2 = 111;

        System.out.println(menor.mensaje());


    }


}




