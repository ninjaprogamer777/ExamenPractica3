package Modelo;

import java.time.LocalDate;

/**
 * @author Amador Moreno
 */
public class Coche {
    
    // Atributos
    private String matricula;
    private LocalDate fechaMatriculacion;
    private float precio;
    
    // Constructores
    public Coche(String matricula, LocalDate fechaMatriculacion, float precio) {
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
        this.precio = precio;
    }
    
    public Coche () {
    
    }
    
    // Métodos
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche: " + matricula + ", Fecha matriculación:" + fechaMatriculacion + ", Precio: " + precio + "€.";
    }
    
}
