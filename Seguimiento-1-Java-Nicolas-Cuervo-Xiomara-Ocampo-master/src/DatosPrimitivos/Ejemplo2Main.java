package DatosPrimitivos;

public class Ejemplo2Main {
    public static void main(String[] args) {
        Ejemplo2 puerta = new Ejemplo2();
        puerta.estado_puerta = false;

        System.out.println(puerta.mensaje());
    }
}
