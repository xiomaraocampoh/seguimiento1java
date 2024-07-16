package BrakeContinue;

public class Ejemplo {
    public int numero;

    public void ciclo(){
        for(int i = 0; i<=numero; i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }
    }
}
