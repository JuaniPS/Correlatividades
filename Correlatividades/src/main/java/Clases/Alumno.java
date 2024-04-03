package Clases;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    public int legajo;

    public String nombre;

    public List<Materia> aprobadas = new ArrayList<>();

    public List<Materia> regularizadas = new ArrayList<>();

    public int getLegajo() {
        return legajo;
    }

    public List<Materia> getAprobadas() {
        return aprobadas;
    }

    public List<Materia> getRegularizadas() {
        return regularizadas;
    }

    public boolean estaAprobada(Materia materia) {
        for(Materia aprobada : aprobadas) {
            if(aprobada.getCodigo() == materia.getCodigo()) {
                return true;
            }
        }
        return false;
    }

    public boolean estaRegularizada(Materia materia) {
        for(Materia regularizada : regularizadas) {
            if(regularizada.getCodigo() == materia.getCodigo()) {
                return true;
            }
        }
        return false;
    }

    public Alumno(int legajo, String nombre, List<Materia> aprobadas, List<Materia> regularizadas) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.aprobadas = aprobadas;
        this.regularizadas = regularizadas;
    }

}