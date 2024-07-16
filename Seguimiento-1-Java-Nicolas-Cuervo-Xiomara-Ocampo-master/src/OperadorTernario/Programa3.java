package OperadorTernario;

public class Programa3 {
    public int edad;

    public void validar(){
        System.out.println(edad <= 0 ? "No puede ingresar " + edad + " años" : edad >= 18 ? "Es mayor de edad" : "es menor de edad");
    }
}
