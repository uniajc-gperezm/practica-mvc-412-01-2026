package com.uniajc.servicios;

import com.uniajc.dao.DocenteDao;
import com.uniajc.modelo.Docente;

import java.util.List;

public class DocenteService {

    private final DocenteDao docenteDao;

    public DocenteService(DocenteDao docenteDao) {
        this.docenteDao = docenteDao;
    }

    public void registrarDocente(Docente docente) {
        if(docente == null) {
            throw new IllegalArgumentException("El docente no puede ser nulo.");
        }
        if(docente.getNombre() == null || docente.getEspecialidad() == null) {
            throw new IllegalArgumentException("Los campos nombre y especialidad del docente son obligatorios.");
        }
        
        docenteDao.guardarDocente(docente);
    }

    public List<Docente> mostrarTodosLosDocentes() {
        return docenteDao.obtenerTodosLosDocentes();
    }

    public Docente obtenerDocentePorId(int id) {
        return docenteDao.obtenerDocentePorId(id);
    }

    public void actualizarDocente(Docente docente) {
        docenteDao.actualizarDocente(docente);
    }

    public void eliminarDocente(int id) {
        docenteDao.eliminarDocente(id);
    }
}