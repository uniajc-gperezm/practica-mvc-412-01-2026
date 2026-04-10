package com.uniajc.controlador;

import java.util.ArrayList;
import java.util.List;

import com.uniajc.modelo.Estudiante;
import com.uniajc.vista.VistaEstudiante;

public class ControladorEstudiante {

    private Estudiante estudiante;
    private List<Estudiante> estudiantes; 
    private VistaEstudiante vista;

    public ControladorEstudiante(Estudiante estudiante, VistaEstudiante vista) {
        this.estudiante = estudiante;
        this.vista = vista;
        this.estudiantes = new ArrayList<Estudiante>();
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public VistaEstudiante getVista() {
        return vista;
    }

    public void setVista(VistaEstudiante vista) {
        this.vista = vista;
    }

    // CREAR
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Estudiante agregado: " + estudiante.getNombre());
    }

    // MOSTRAR UNO
    public void actualizarVista() {
        vista.mostrarDetallesEstudiante(estudiante);
    }

    // MOSTRAR TODOS
    public void mostrarTodosLosEstudiantes() {
        vista.mostrarTodosLosEstudiantes(estudiantes);
    }

    // LEER
    public Estudiante buscarEstudiantePorId(int index) {
        if (index >= 0 && index < estudiantes.size()) {
            return estudiantes.get(index);
        }
        System.out.println("Estudiante no encontrado");
        return null;
    }

    // ACTUALIZAR
    public void actualizarEstudiante(int index, Estudiante nuevo) {
        if (index >= 0 && index < estudiantes.size()) {
            estudiantes.set(index, nuevo);
            System.out.println("Estudiante actualizado: " + nuevo.getNombre());
        } else {
            System.out.println("Índice inválido");
        }
    }

    // ELIMINAR
    public void eliminarEstudiante(int index) {
        if (index >= 0 && index < estudiantes.size()) {
            Estudiante eliminado = estudiantes.remove(index);
            System.out.println("Estudiante eliminado: " + eliminado.getNombre());
        } else {
            System.out.println("Índice inválido");
        }
    }
}