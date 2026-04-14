
package com.uniajc.vista;

import com.uniajc.modelo.Docente;
import java.util.List;

public class VistaDocente 
{

    public void mostrarDetallesDocente(Docente docente) 
    {
        System.out.println("Detalles del Docente:");
        System.out.println("Nombre: " + docente.getNombre());
        System.out.println("Edad: " + docente.getEdad());
        System.out.println("Especialidad: " + docente.getEspecialidad());
    }

    public void mostrarTodosLosDocentes(List<Docente> docentes) 
    {
        System.out.println("Lista de Docentes:");
        for (Docente docente : docentes) {
            mostrarDetallesDocente(docente);
            System.out.println("  ");
        }
    }
}

