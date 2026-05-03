package com.uniajc.servicios;

import com.uniajc.dao.MateriaDao;
import com.uniajc.modelo.Materia;

import java.util.List;

public class MateriaService {

    private final MateriaDao materiaDao;

    public MateriaService(MateriaDao materiaDao) {
        this.materiaDao = materiaDao;
    }

    public void registrarMateria(Materia materia) {
        if(materia == null) {
            throw new IllegalArgumentException("La materia no puede ser nula.");
        }
        if(materia.getNombreMateria() == null || materia.getCreditos() == null) {
            throw new IllegalArgumentException("Los campos nombre y créditos de la materia son obligatorios.");
        }
        
        materiaDao.guardarMateria(materia);
    }

    public List<Materia> mostrarTodasLasMaterias() {
        return materiaDao.obtenerTodasLasMaterias();
    }

    public Materia obtenerMateriaPorId(int id) {
        return materiaDao.obtenerMateriaPorId(id);
    }

    public void actualizarMateria(Materia materia) {
        materiaDao.actualizarMateria(materia);
    }

    public void eliminarMateria(int id) {
        materiaDao.eliminarMateria(id);
    }
}