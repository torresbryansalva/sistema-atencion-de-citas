
package bienvenidos;

import bienvenidos.vista.frmLogin;
import javax.swing.JOptionPane;


public class SistemaAtencionDeCitas {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Hola listos para comenzar?");
        frmLogin l = new frmLogin();
        l.setVisible(true);
    }
}
