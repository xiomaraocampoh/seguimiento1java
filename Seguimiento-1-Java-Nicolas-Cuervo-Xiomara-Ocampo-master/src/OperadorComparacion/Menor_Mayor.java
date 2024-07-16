package OperadorComparacion;

public class Menor_Mayor {
    public int numero1;
    public int numero2;

    public String mensaje(){
        return (" \nAl comparar los numeros: " + numero1 + " y " + numero2 + " el resultado sera: " + (numero1 <= numero2) + ", debido a que el operador <= determina si un valor es menor o igual al otro valor, por lo tanto, devuelve \nun true si el valor es igual o menor a este valor o false si el valor es mayor");
    }
}
