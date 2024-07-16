package If_else;

public class Programa2 {
    public int num1;

    public String mensaje(){
        if (num1 > 0) return ("El numero es positivo");
        if (num1 < 0) return ("El numero es negativo");
        else return ("El numero es 0");
    }
}
