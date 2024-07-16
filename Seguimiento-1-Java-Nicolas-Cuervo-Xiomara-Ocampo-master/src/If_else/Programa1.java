package If_else;

import javax.swing.*;
import java.util.Scanner;

public class Programa1 {
    public String usuario;
    public String usuarioSistema = "Estudiante_Humboldt";
    public String contraseña;
    public String contraseñaSistema = "1234";

    public void validar(){
        JOptionPane.showMessageDialog(null,"Bienbenido al sistema, ingrese su asuario y contraseña");
        usuario = (JOptionPane.showInputDialog("Usuario: "));
        contraseña = (JOptionPane.showInputDialog("Contraseña: "));


        if (usuario.equals(usuarioSistema) && contraseña.equals(contraseñaSistema)) JOptionPane.showMessageDialog(null,"Ha ingresado al sistema");
        else JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrecta, vuelva a intentarlo");



    }
}
