package OpDIncremento_Decremento;

public class IncrementoMain {
    public static void main(String[] args) {
        Incremento incrementoSuma = new Incremento();

        incrementoSuma.numero1++;
        incrementoSuma.numero2++;
        incrementoSuma.numero3++;

        incrementoSuma.mensaje();
    }
}
