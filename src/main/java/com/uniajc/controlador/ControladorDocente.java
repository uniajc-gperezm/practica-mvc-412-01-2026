package com.uniajc.controlador;

import java.util.ArrayList;
import java.util.List;

import com.uniajc.modelo.Docente;
import com.uniajc.vista.VistaDocente;

public class ControladorDocente {
    private Docente docente;
    private List<Docente> docentes; // Para manejar múltiples docentes
    private VistaDocente vista;

    public ControladorDocente(Docente docente, VistaDocente vista) {
        this.docente = docente;
        this.vista = vista;
        this.docentes = new ArrayList<Docente>(); // Inicializar la lista de docentes
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

    public void actualizarDocente(int Id, String nuevaMateria, double nuevoSalario) {
    for (Docente d : docentes) {
        if (d.getId() == Id) { // Aquí podrías usar un ID único en lugar del nombre
            d.setMateria(nuevaMateria);
            d.setSalario(nuevoSalario);
            System.out.println("Docente actualizado");
            return;
        }
    }
    System.out.println("Docente no encontrado");
}

public void eliminarDocente(int Id) {
    docentes.removeIf(d -> d.getId() == Id); // Aquí podrías usar un ID único en lugar del nombre
    System.out.println("Docente eliminado");
}

    public void actualizarVista() {
        vista.mostrarDetallesDocente(docente);
    }

    public void mostrarTodosLosDocentes() {
        vista.mostrarTodosLosDocentes(docentes);

    }

    // Buscar docente
public Docente buscarDocente(int Id) {
    for (Docente d : docentes) {
        if (d.getId() == Id) {
            return d;
        }
    }
    return null;
}

// Aumentar salario
public void aumentarSalarioDocente(int Id, double porcentaje) {
    for (Docente d : docentes) {
        if (d.getId() == Id) {
            d.aumentarSalario(porcentaje);
            System.out.println("Salario actualizado");
            return;
        }
    }
}




}
