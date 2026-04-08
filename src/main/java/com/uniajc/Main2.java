package com.uniajc;

import com.uniajc.vista.VistaDocente;
import com.uniajc.controlador.ControladorDocente;
import com.uniajc.modelo.Docente;

public class Main2 {
    public static void main(String[] args) {
    
            VistaDocente vista = new VistaDocente();
            ControladorDocente controlador = new ControladorDocente(null, vista);
    
            // CREATE
            controlador.agregarDocente(new Docente(1, "Carlos", 40, "Matemáticas", 2000000));
            controlador.agregarDocente(new Docente(2, "Ana", 35, "Programación", 2500000));
    
            // READ
            controlador.mostrarTodosLosDocentes();
    
            // UPDATE
            controlador.actualizarDocente(1, "Física", 3000000);
    
            // MÉTODO EXTRA
            controlador.aumentarSalarioDocente(2, 10);
    
            // DELETE
            controlador.eliminarDocente(1);
    
            // READ FINAL
            controlador.mostrarTodosLosDocentes();
        }
    }

