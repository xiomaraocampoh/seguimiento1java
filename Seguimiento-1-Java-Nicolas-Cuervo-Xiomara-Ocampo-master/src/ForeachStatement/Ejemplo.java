package ForeachStatement;

import java.util.ArrayList;

public class Ejemplo {
    public ArrayList<Integer> numeros = new ArrayList<Integer>();

    public void elevar(){
     numeros.forEach(n -> System.out.print(n + "hola "));
    }
}
