package OperadorComparacion;

public class ComparacionMenorque {
    public int numero1;
    public int numero2;

    public String mensaje(){
        return (" \nAl comparar los numeros: " + numero1 + " y " + numero2 + " el resultado sera: " + (numero1 != numero2) + ", debido a que el operador != determina si dos valores son diferentes por lo tanto devuelve \nun true si son diferentes o false si son iguales");
    }
}
