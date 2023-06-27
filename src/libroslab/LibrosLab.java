//Irvin Torres --- tm22012
package libroslab;

import java.util.Stack;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.get;

/**
 *
 * @author irvin
 */
public class LibrosLab {
    private Stack<Libro> libreria;
    
    public LibrosLab() {
        libreria = new Stack<>();
    }
    
public void leerDatos() {
    int cantidad = 0;
    boolean entradaValida = false;

    while (!entradaValida) {
        String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad de libros a registrar");

        try {
            cantidad = Integer.parseInt(cantidadStr);
            if (cantidad > 0) {
                entradaValida = true;
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero mayor que cero.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero válido.");
        }
    }

    for (int i = 1; i <= cantidad; i++) {
        JOptionPane.showMessageDialog(null, "Ingrese la info del libro " + i);

        String titulo = "";
        while (titulo.isEmpty()) {
            titulo = JOptionPane.showInputDialog("Ingrese el título del libro");
            if (titulo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un título válido.");
            }
        }

        String autor = "";
        while (autor.isEmpty()) {
            autor = JOptionPane.showInputDialog("Ingrese el autor");
            if (autor.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un autor válido.");
            }
        }

        Libro libro = new Libro(titulo, autor);
        libreria.push(libro);
    }
}




public void mostrarDatos() {
    StringBuilder datos = new StringBuilder();
    for (Libro libro : libreria) {
        datos.append("Título: ").append(libro.getTitulo()).append(", Autor:  ").append(libro.getAutor()).append("\n");
    }
    JOptionPane.showMessageDialog(null, datos.toString());
}
public void mostrarPila() {
    Stack<Libro> copiaPila = (Stack<Libro>) libreria.clone();
    StringBuilder sb = new StringBuilder();

    while (!copiaPila.isEmpty()) {
        Libro libro = copiaPila.pop();
        sb.append("Título: ").append(libro.getTitulo()).append(", Autor: ").append(libro.getAutor()).append("\n");
    }

    JOptionPane.showMessageDialog(null,"Esta es la pila original: \n"+ sb.toString());
}



    }
