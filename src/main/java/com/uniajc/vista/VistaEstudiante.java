package com.uniajc.vista;

import java.util.List;
import com.uniajc.modelo.Estudiante;

public class VistaEstudiante {

    public void mostrarDetallesEstudiante(Estudiante estudiante) {
        System.out.println("Detalles del Estudiante:");
        System.out.println("Nombre: " +estudiante.getNombre());
        System.out.println("Edad: " +estudiante.getEdad());
        System.out.println("");
    }

    public void mostrarTodosLosEstudiantes(List<Estudiante> estudiantes) {
        System.out.println("\nLista de Estudiantes:");
        for(Estudiante estudiante : estudiantes) {
            mostrarDetallesEstudiante(estudiante);
            System.out.println("-------------------");
        }
    }
}