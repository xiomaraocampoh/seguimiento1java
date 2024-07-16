package OperadorTernario;

import com.sun.jdi.TypeComponent;

import java.lang.reflect.Array;

public class Programa1 {
    public int numero1;

    public String par(){
        return numero1 == 0 ? "El numero 0 es un numero neutro": numero1 % 2 == 0 ? "el numero " + Math.abs(numero1) +" es par" : "el numero " + Math.abs(numero1) + " es impar";
    };
}
