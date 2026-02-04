package angel_ibanez_r5_u3;

import java.util.Scanner;

public class Alumno extends Persona implements Calificaciones {

    // Atributos exclusivos de Alumno
    double espanol;
    double ciencias;
    double matematicas;
    double promedio;

    // Constructor
    public Alumno() {
        super();
    }

    public void guardarCalificacion(double espanol, double ciencias, double matematicas) {
        this.espanol = espanol;
        this.ciencias = ciencias;
        this.matematicas = matematicas;
        this.promedio = (matematicas + espanol + ciencias) / 3;
    }

    @Override
    public void mostrarCalificaciones() {
        System.out.printf("""
                -------------------- CALIFICACIONES --------------------
                Espanol:     %.2f
                Ciencias:    %.2f
                Matematicas: %.2f
                ------------------------------------------------
                \tPromedio Final: %.2f
                
                """, espanol, ciencias, matematicas, promedio);
    }
}

