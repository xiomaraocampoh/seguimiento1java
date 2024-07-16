package OperadorTernario;

public class Programa5 {
    public char tipo;

    public void mensaje(){
        System.out.println(tipo == 'a' || tipo == 'e' || tipo == 'i' || tipo == 'o' || tipo == 'u' ? "la letra " + tipo + " es una vocal" : "La letra " + tipo + " es una consonante");
    }
}
