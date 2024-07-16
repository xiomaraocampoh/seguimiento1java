package Switcht_Case;

public class Ejemplo1 {
    public int dia;

    public String dia_semana(){
        switch (dia){
            case 1: return ("Hoy es lunes");
            case 2: return("Hoy es Martes");
            case 3: return("Hoy es Miercoles");
            case 4: return("Hoy es Jueves");
            case 5: return("Hoy es Viernes");
            case 6: return("Hoy es Sabado");
            case 7: return("Hoy es Domingo");
            default: return ("Dato erroneo ingresado");
        }
    }
}
