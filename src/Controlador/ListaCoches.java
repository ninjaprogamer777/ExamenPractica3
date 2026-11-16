package Controlador;

import Modelo.Coche;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Amador Moreno
 */
public class ListaCoches extends ArrayList<Coche>{
    
    // Atributos
    private int actual = 0;
    
    // Constructor
    public ListaCoches() {
        this.actual = actual;
    }
    
    // Métodos
    public boolean esVacia() {
        return isEmpty();
    }
    
    public void avanzar() {
        if (!isEmpty() && actual < size() - 1) {
            actual++;
        }
    }

    public void retroceder() {
        if (!isEmpty() && actual > 0) {
            actual--;
        }
    }
    
    public void irAlPrimero() {
        if (!isEmpty()) {
            actual = 0;
        }
    }
    
    public void irAlUltimo() {
        if (!isEmpty()) {
            actual = size() - 1;
        }
    }

    public boolean esPrimero() {
        return !isEmpty() && actual == 0;
    }

    public boolean esUltimo() {
        return !isEmpty() && actual == size() - 1;
    }
    
    public void anadirCoche(Coche c) {
        add(c);
        ordenarPorMatricula();
        actual = indexOf(c);
    }
    
    public void borrarCoche(int actual) {
        if (!isEmpty()) {
            remove(actual);

            if (isEmpty()) {
                actual = 0;
            } else if (actual >= size()) {
                actual = size() - 1;
            }
        }
    }
    
    public int obtenerCocheActual() {
        return actual;
    }
    
    public void ordenarPorMatricula() {
        sort(Comparator.comparing(Coche::getMatricula));

        if (isEmpty()) {
            actual = 0;
        } else if (actual >= size()) {
            actual = size() - 1;
        }
    }
    
}
