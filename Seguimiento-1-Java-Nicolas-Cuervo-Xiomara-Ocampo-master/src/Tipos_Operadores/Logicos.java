package Tipos_Operadores;

public class Logicos {
    public int num1;
    public int num2;
    public int num3;
    public int num4;

    public String mensaje(){
        if (num1 == num2 && num2 == num3 && num3 == num4){
            return ("Todos los numeros son iguales");
        }

        else{
            return ("Se ha encontrado algun numero diferente al resto");
        }
    };
}
