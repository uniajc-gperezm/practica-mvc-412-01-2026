package com.uniajc.controlador;

import com.uniajc.modelo.Docente;
import com.uniajc.modelo.Grupo;
import com.uniajc.modelo.Materia;
import com.uniajc.servicios.DocenteService;
import com.uniajc.servicios.GrupoService;
import com.uniajc.servicios.MateriaService;
import com.uniajc.vista.VistaGrupo;

public class ControladorGrupo {

    private VistaGrupo vistaGrupo;
    private GrupoService grupoService;
    private MateriaService materiaService;
    private DocenteService docenteService;

    public ControladorGrupo(VistaGrupo vistaGrupo, GrupoService grupoService, MateriaService materiaService, DocenteService docenteService) {
        this.vistaGrupo = vistaGrupo;
        this.grupoService = grupoService;
        this.materiaService = materiaService;
        this.docenteService = docenteService;
    }

    public void registrarGrupo() {
        String[] datos = vistaGrupo.solicitarDatosGrupo();

        int idMateria = Integer.parseInt(datos[0]);
        int idDocente = Integer.parseInt(datos[1]);
        String aula   = datos[2];
        String horario = datos[3];

        Materia materia = materiaService.obtenerMateriaPorId(idMateria);
        Docente docente = docenteService.obtenerDocentePorId(idDocente);

        if(materia == null) {
            vistaGrupo.mostrarMensaje("No se encontró una materia con el ID proporcionado.");
            return;
        }
        if(docente == null) {
            vistaGrupo.mostrarMensaje("No se encontró un docente con el ID proporcionado.");
            return;
        }

        Grupo nuevoGrupo = new Grupo(0, materia, docente, aula, horario);

        grupoService.registrarGrupo(nuevoGrupo);
        vistaGrupo.mostrarMensaje("Grupo registrado exitosamente.");
    }

    public void mostrarTodosLosGrupos() {
        vistaGrupo.mostrarTodosLosGrupos(grupoService.mostrarTodosLosGrupos());
    }

    public void mostrarDetallesGrupo(int id) {
        Grupo grupo = grupoService.obtenerGrupoPorId(id);

        if(grupo != null) {
            vistaGrupo.mostrarDetallesGrupo(grupo);
        } else {
            vistaGrupo.mostrarMensaje("No se encontró un grupo con el ID proporcionado.");
        }
    }

    public void actualizarGrupo() {
        int id = vistaGrupo.solicitarIdGrupo();
        Grupo grupoExistente = grupoService.obtenerGrupoPorId(id);

        if(grupoExistente == null) {
            vistaGrupo.mostrarMensaje("No se encontró un grupo con el ID proporcionado.");
            return;
        }

        String[] datos = vistaGrupo.solicitarDatosGrupoActualizados();

        int idMateria = Integer.parseInt(datos[0]);
        int idDocente = Integer.parseInt(datos[1]);
        String aula = datos[2];
        String horario = datos[3];

        Materia materia = materiaService.obtenerMateriaPorId(idMateria);
        Docente docente = docenteService.obtenerDocentePorId(idDocente);

        if(materia == null) {
            vistaGrupo.mostrarMensaje("No se encontró una materia con el ID proporcionado.");
            return;
        }
        if(docente == null) {
            vistaGrupo.mostrarMensaje("No se encontró un docente con el ID proporcionado.");
            return;
        }

        Grupo grupoActualizado = new Grupo(grupoExistente.getId(), materia, docente, aula, horario);
        
        grupoService.actualizarGrupo(grupoActualizado);
        vistaGrupo.mostrarMensaje("Grupo actualizado exitosamente.");
    }

    public void eliminarGrupo() {
        int id = vistaGrupo.solicitarIdGrupoParaEliminar();
        grupoService.eliminarGrupo(id);
        vistaGrupo.mostrarMensaje("Grupo eliminado exitosamente.");
    }
}