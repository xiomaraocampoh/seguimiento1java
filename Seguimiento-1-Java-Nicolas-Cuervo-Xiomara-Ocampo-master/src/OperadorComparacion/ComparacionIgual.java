package OperadorComparacion;

public class ComparacionIgual {
    public int numero_string;
    public int numero_int;

    public String mensaje(){
        return ("Al comparar los numeros: " + numero_string + " y " + numero_int + " el resultado sera: " + (numero_string == numero_int) + ", debido a que el operador == compara dos tipos de datos y devuelve \nun true si son iguales o false si son diferentes");
    }
}




