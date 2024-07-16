package If_else;

public class Programa3 {
    public String palabra;

    public String palindromo(){
        if (new StringBuilder(palabra).reverse().toString().equals(palabra)) return "la palabra " + palabra + " si es un palindromo debido a que al reves se escribe " + new StringBuilder(palabra).reverse().toString();

        else return "la palabra " + palabra + " no es un palindromo debido a que al reves se escribe " + new StringBuilder(palabra).reverse().toString();
}

}
