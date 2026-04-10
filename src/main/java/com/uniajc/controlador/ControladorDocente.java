package com.uniajc.controlador;

import java.util.ArrayList;
import java.util.List;

import com.uniajc.modelo.Docente;
import com.uniajc.vista.VistaDocente;

public class ControladorDocente {

    private Docente docente;
    private List<Docente> docentes;
    private VistaDocente vista;

    public ControladorDocente(Docente docente, VistaDocente vista) {
        this.docente = docente;
        this.vista = vista;
        this.docentes = new ArrayList<Docente>();
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public VistaDocente getVista() {
        return vista;
    }

    public void setVista(VistaDocente vista) {
        this.vista = vista;
    }

    public void agregarDocente(Docente docente) {
        docentes.add(docente);
        System.out.println("Docente agregado: " + docente.getNombre());
    }

    public void actualizarVista() {
        vista.mostrarDetallesDocente(docente);
    }

    public void mostrarTodosLosDocentes() {
        vista.mostrarTodosLosDocentes(docentes);
    }
}
