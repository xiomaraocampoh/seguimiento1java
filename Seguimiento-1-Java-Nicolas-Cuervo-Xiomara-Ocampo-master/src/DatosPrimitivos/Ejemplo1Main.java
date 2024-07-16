package DatosPrimitivos;

public class Ejemplo1Main {
    public static void main(String[] args) {
        Ejemplo1 primitivoInt = new Ejemplo1();
        primitivoInt.NumeroEntero = 100;

        System.out.printf(primitivoInt.mensaje());
    }
}
