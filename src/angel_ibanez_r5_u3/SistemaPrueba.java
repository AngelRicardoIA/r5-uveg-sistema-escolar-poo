/**
 * DISCLAIMER:
 * Este proyecto es únicamente con fines académicos y de práctica personal
 * para reforzar los conceptos de Programación Orientada a Objetos en Java.
 * No se fomenta el plagio ni el uso indebido de este código para 
 * afectar el aprendizaje de otros estudiantes.
 * 
 * Autor: Angel Ricardo Ibanez Aceves
 * Fecha: 02/02/2026
 */

package angel_ibanez_r5_u3;
import java.util.Scanner;

public class SistemaPrueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==================== SISTEMA ESCOLAR RIO GRANDE ====================");
        
        //Alumno
        System.out.println("-------------------- ALUMNO --------------------\n");
        Alumno alumno1 = new Alumno();
        
        System.out.print("Escribe el nombre del alumno: ");
        var inputNombre = sc.nextLine();
        alumno1.setNombre(inputNombre);
        
        System.out.print("Escribe el apellido paterno del alumno: ");
        var inputApellidoPaterno = sc.nextLine();
        alumno1.setApellidoPaterno(inputApellidoPaterno);
        
        System.out.print("Escribe el apellido materno del alumno: ");
        var inputApellidoMaterno = sc.nextLine();
        alumno1.setApellidoMaterno(inputApellidoMaterno);
        
        //Calificaciones del alumno
        System.out.print("Ingresa calificacion Espanol:");
        double calEsp = Double.parseDouble(sc.nextLine());

        System.out.print("Ingresa calificacion Ciencias:");
        double calCie = Double.parseDouble(sc.nextLine());

        System.out.print("Ingresa calificacion Matematicas:");
        double calMat = Double.parseDouble(sc.nextLine());
        alumno1.guardarCalificacion(calEsp, calCie, calMat);
        
        alumno1.imprimirPerfil();
        alumno1.mostrarCalificaciones();
        
        //Maestro
        System.out.println("\n-------------------- MAESTRO -------------------\n");
        Maestro maestro1 = new Maestro();
        
        System.out.print("Escribe el nombre del Maestro: ");
        var inputNombreMaestro = sc.nextLine();
        maestro1.setNombre(inputNombreMaestro);
        
        System.out.print("Escribe el apellido paterno del maestro: ");
        var inputApellidoPaternoMaestro = sc.nextLine();
        maestro1.setApellidoPaterno(inputApellidoPaternoMaestro);
        
        System.out.print("Escribe el apellido materno del maestro: ");
        var inputApellidoMaternoMaestro = sc.nextLine();
        maestro1.setApellidoMaterno(inputApellidoMaternoMaestro);
        
        maestro1.imprimirPerfil();
        
        //Tutor
        System.out.println("\n-------------------- TUTOR --------------------\n");
        Tutor tutor1 = new Tutor();
        
        System.out.print("Escribe el nombre del tutor: ");
        var inputNombreTutor = sc.nextLine();
        tutor1.setNombre(inputNombreTutor);
        
        System.out.print("Escribe el apellido paterno del tutor: ");
        var inputApellidoPaternoTutor = sc.nextLine();
        tutor1.setApellidoPaterno(inputApellidoPaternoTutor);
        
        System.out.print("Escribe el apellido materno del tutor: ");
        var inputApellidoMaternoTutor = sc.nextLine();
        tutor1.setApellidoMaterno(inputApellidoMaternoTutor);
        
        tutor1.imprimirPerfil();
        System.out.println("Alumno asignado: " + alumno1.getNombre() + " " + alumno1.getApellidoPaterno() + " "
                + alumno1.getApellidoMaterno());
        tutor1.setAlumno(alumno1);
        tutor1.mostrarCalificaciones();
    }
}
