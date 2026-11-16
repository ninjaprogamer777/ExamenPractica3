package Controlador;

import java.time.LocalDate;

/**
 * @author Amador Moreno
 */
public class ControlErrores {
    
    public static boolean comprobarMatricula(String matricula) {
        return matricula == null || matricula.isBlank();
        
        char[] caracter = matricula.toCharArray();
        
        for (int i = 0; i < 3; i++) {
            if (caracter[i] < 0)
                return false;
        }
        
        /*for (int i = 4; i < 6; i++) {
            if (caracter[i] != ){
                return false;
            }
        }*/
        
        return true;
    }
    
    public static boolean validarFechaMatriculacion(LocalDate fecha) {
        if (fecha == null) {
            return false;
        }

        LocalDate minimo = LocalDate.of(1900, 1, 1);
        LocalDate maximo = LocalDate.of(2026, 11, 16);

        return !fecha.isBefore(minimo) && !fecha.isAfter(maximo);
    }
    
    public static boolean validarPrecio (float precio) {
        if (precio == 0){
            return false;
        }
        
        return precio > 0 && precio < 150000;
    }
    
}
