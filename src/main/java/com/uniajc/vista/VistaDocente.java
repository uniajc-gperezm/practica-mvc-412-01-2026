package com.uniajc.vista;
import java.util.List;

import com.uniajc.modelo.Docente;

public class VistaDocente {

    public void mostrarDetallesDocente(Docente docente) {
        System.out.println("Detalles del Docente:");
        System.out.println("Nombre: " + docente.getNombre());
        System.out.println("Edad: " + docente.getEdad());
        System.out.println("Materia: " + docente.getMateria());
        System.out.println("Salario: " + docente.getSalario());
        


    }

    public void mostrarTodosLosDocentes(List<Docente> docentes) {
        System.out.println("Lista de Docentes:");
        for (Docente docente : docentes) {
            mostrarDetallesDocente(docente);
            System.out.println("-------------------");
        }
    }

    

}
