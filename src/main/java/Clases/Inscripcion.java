package Clases;

import java.util.List;

public class Inscripcion {

    public int id;

    public Alumno alumno;

    public List<Materia> materias;

    public int getId() {
        return id;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public boolean verificarAprobadas(Materia materia) {
        for(Materia correlativa : materia.getCorrelativas_aprobadas()) {
            if(!alumno.estaAprobada(correlativa)) {
                return false;
            }
        }
        return true;
    }

    public boolean verificarRegularizadas(Materia materia) {
        for(Materia correlativa : materia.getCorrelativas_regularizadas()) {
            if(!alumno.estaRegularizada(correlativa)) {
                return false;
            }
        }
        return true;
    }

    public boolean aprobada() {
        for(Materia materia : materias) {
            if(!verificarAprobadas(materia) || !verificarRegularizadas(materia)) {
                return false;
            }
        }
        return true;
    }

    public Inscripcion(int id, Alumno alumno, List<Materia> materias) {
        this.id = id;
        this.alumno = alumno;
        this.materias = materias;
    }

}
