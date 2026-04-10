package com.uniajc;

import com.uniajc.controlador.ControladorDocente;
import com.uniajc.controlador.ControladorEstudiante;
import com.uniajc.modelo.Docente;
import com.uniajc.modelo.Estudiante;
import com.uniajc.vista.VistaDocente;
import com.uniajc.vista.VistaEstudiante;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practica MVC - UNIAJC");

        // System.out.println("Creando el modelo...");
        Estudiante estudiante = new Estudiante("Juan Perez", 20);
        
        // System.out.println("Creando la vista...");
        VistaEstudiante vista = new VistaEstudiante();

        // System.out.println("Creando el controlador...");
        ControladorEstudiante controlador = new ControladorEstudiante(estudiante, vista);

        // System.out.println("Actualizando la vista...");
        controlador.actualizarVista();
        
        // System.out.println("Modificando el modelo...");
        estudiante.setNombre("MarÃ­a LÃ³pez");
        estudiante.setEdad(22);

        // System.out.println("Actualizando la vista despues de modificar el modelo...");
        controlador.actualizarVista();

        System.out.println("-----------------------");
        System.out.println("Agregando mÃ¡s estudiantes y mostrando la lista completa...");


        controlador.agregarEstudiante(new Estudiante("Carlos GGomez", 19));
        controlador.agregarEstudiante(new Estudiante("Ana Martinez", 21));
        controlador.agregarEstudiante(new Estudiante("Luis Fernandez", 20));
        controlador.mostrarTodosLosEstudiantes();

        System.out.println("-----------------------");
        System.out.println("Creando docente y mostrando la lista completa...");

        Docente docente = new Docente("Laura Torres", "MatemÃ¡ticas");
        VistaDocente vistaDocente = new VistaDocente();
        ControladorDocente controladorDocente = new ControladorDocente(docente, vistaDocente);

        controladorDocente.actualizarVista();

        docente.setNombre("Andres Ruiz");
        docente.setMateria("Fisica");

        controladorDocente.actualizarVista();

        controladorDocente.agregarDocente(new Docente("Paula Jimenez", "Biologia"));
        controladorDocente.agregarDocente(new Docente("Sergio Mora", "Historia"));
        controladorDocente.agregarDocente(new Docente("Camila Ortega", "Quimica"));
        controladorDocente.mostrarTodosLosDocentes();
    }
}
