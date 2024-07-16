package Tipos_Operadores;

import java.util.Scanner;

public class AritmeticosMain {
    public static void main(String[] args) {
        Aritmeticos operacion = new Aritmeticos();

        Scanner numero1 = new Scanner(System.in);
        Scanner numero2 = new Scanner(System.in);


        System.out.print("Digite un numero: ");
        operacion.num1 = numero1.nextInt();
        System.out.print("Digite otro numero: ");
        operacion.num2 = numero2.nextInt();


        System.out.println("La suma de los numeros "+ operacion.num1 + " y " + operacion.num2 + " da un total de: " + operacion.suma());
    }
}
