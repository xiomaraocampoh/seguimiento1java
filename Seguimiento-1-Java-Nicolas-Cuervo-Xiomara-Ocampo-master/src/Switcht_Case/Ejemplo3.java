package Switcht_Case;

public class Ejemplo3 {
    public int figura;

    public void determinar(){
        switch (figura){
            case 4:
                System.out.println("La figura determinada por " + figura + " lados es un cuadrado");
                break;
            case 3:
                System.out.println("La figura determinada por " + figura + " lados es un triangulo");
                break;
            case 5:
                System.out.println("La figura determinada por " + figura + " lados es un pentagono");
                break;
            case 6:
                System.out.println("La figura determinada por " + figura + " lados es un hexagono");
                break;
            case 7:
                System.out.println("La figura determinada por " + figura + " lados es un heptagono");
                break;
            case 8:
                System.out.println("La figura determinada por " + figura + " lados es un octagono");
                break;
            case 9:
                System.out.println("La figura determinada por " + figura + " lados es un nonagono");
                break;
            case 10:
                System.out.println("La figura determinada por " + figura + " lados es un decagono");
                break;
            default:
                System.out.println("No fue posible determinar la figura");
        }
    }
}
