package OperadorTernario;

public class Programa4 {
    public double nota1;
    public double nota2;
    public double nota3;


    public void resultado(){
        System.out.println(((nota1 + nota2 + nota3) / 3) >= 3.0 ? "Gano la materia en: " + ((nota1 + nota2 + nota3) / 3) : "Perdio la materia: " + ((nota1 + nota2 + nota3) / 3));
    }

}
