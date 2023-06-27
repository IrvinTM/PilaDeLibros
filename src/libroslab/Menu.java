//Irvin Torres --- tm22012
package libroslab;

import javax.swing.JOptionPane;

/**
 *
 * @author irvin
 */
public class Menu {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al programa libreria");
        JOptionPane.showMessageDialog(null, "Este proograma crea una pila y la muestra en orden de ingreso\n"
                + "tambien al final muestra la pila original usando el metodo pop");
        LibrosLab librosLab = new LibrosLab();
        librosLab.leerDatos();
        librosLab.mostrarDatos();
        librosLab.mostrarPila();
    }
    
}
