package OperadorTernario;
import java.util.ArrayList;
import java.lang.reflect.Array;

public class Programa2 {
    public int numero;

    public void mensaje(){
        System.out.println(numero == 2 ? "El numero" + numero + " es primo" :
                numero == 1? "El numero " + numero + " no es primo" :
                        numero % 2 == 0 ? "El numero " + numero + " no es primo":
                                "El numero " + numero + " es primo");
    }
}
