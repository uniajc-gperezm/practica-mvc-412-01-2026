package com.uniajc;

import com.uniajc.controlador.ControladorEstudiante;
import com.uniajc.controlador.ControladorDocente;
import com.uniajc.modelo.Estudiante;
import com.uniajc.modelo.Docente;
import com.uniajc.vista.VistaEstudiante;
import com.uniajc.vista.VistaDocente;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practica MVC - UNIAJC\n");

        // ====== ESTUDIANTES ======
        // System.out.println("Creando el modelo...");
        Estudiante estudiante = new Estudiante("Juan Perez", 20);
        
        // System.out.println("Creando la vista...");
        VistaEstudiante vista = new VistaEstudiante();

        // System.out.println("Creando el controlador...");
        ControladorEstudiante controlador = new ControladorEstudiante(estudiante, vista);

        // System.out.println("Actualizando la vista...");
        controlador.actualizarVista();
        
        // System.out.println("Modificando el modelo...");
        estudiante.setNombre("María López");
        estudiante.setEdad(22);

        // System.out.println("Actualizando la vista después de modificar el modelo...");
        controlador.actualizarVista();

        System.out.println("Agregando más estudiantes y mostrando la lista completa...");

        controlador.agregarEstudiante(estudiante);
        controlador.agregarEstudiante(new Estudiante("Carlos Gómez", 19));
        controlador.agregarEstudiante(new Estudiante("Ana Martínez", 21)); 
        controlador.agregarEstudiante(new Estudiante("Luis Fernández", 20));
        controlador.mostrarTodosLosEstudiantes();

        System.out.println("Buscando un estudiante por nombre...");
        controlador.buscarEstudiante("Ana Martínez");

        System.out.println("-----------------------");
        System.out.println("Actualizando un estudiante...");
        controlador.actualizarEstudiante(new Estudiante("Luis Fernández", 25));

        System.out.println("-----------------------");
        System.out.println("Eliminando un estudiante...");
        controlador.eliminarEstudiante(new Estudiante("Carlos Gómez", 19));

        controlador.mostrarTodosLosEstudiantes();

        // ===== DOCENTES ======
        System.out.println("\nDocentes MVC\n");
        Docente docente = new Docente("Ana Suárez", 35);
        VistaDocente vistaDocente = new VistaDocente();
        ControladorDocente controladorDocente = new ControladorDocente(docente, vistaDocente);

        controladorDocente.actualizarVista();

        docente.setNombre("Ana María Suárez");
        docente.setEdad(36);
        controladorDocente.actualizarVista();

        System.out.println("Agregando más docentes y mostrando la lista completa...");
        controladorDocente.agregarDocente(docente);
        controladorDocente.agregarDocente(new Docente("Pedro Ramírez", 42));
        controladorDocente.agregarDocente(new Docente("Laura Castro", 29));
        controladorDocente.agregarDocente(new Docente("Marta Rojas", 38));
        controladorDocente.mostrarTodosLosDocentes();

        System.out.println("Buscando un docente por nombre...");
        controladorDocente.buscarDocente("Laura Castro");

        System.out.println("-----------------------");
        System.out.println("Actualizando un docente...");
        controladorDocente.actualizarDocente(new Docente("Marta Rojas", 39));

        System.out.println("-----------------------");
        System.out.println("Eliminando un docente...");
        controladorDocente.eliminarDocente(new Docente("Pedro Ramírez", 42));

        controladorDocente.mostrarTodosLosDocentes();
    }
}