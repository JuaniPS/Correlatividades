package Clases;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    public Long codigo;
    public String nombre;

    public List<Materia> correlativas_regularizadas = new ArrayList<>();
    public List<Materia> correlativas_aprobadas = new ArrayList<>();

    public Long getCodigo() {
        return codigo;
    }

    public List<Materia> getCorrelativas_regularizadas() {
        return correlativas_regularizadas;
    }

    public List<Materia> getCorrelativas_aprobadas() {
        return correlativas_aprobadas;
    }

    // Materias de primer año
    public Materia(Long codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Materias de segundo año
    public Materia(Long codigo, String nombre, List<Materia> regularizadas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correlativas_regularizadas = regularizadas;
    }

    // Materias de tercer año
    public Materia(Long codigo, String nombre, List<Materia> aprobadas, List<Materia> regularizadas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correlativas_regularizadas = regularizadas;
        this.correlativas_aprobadas = aprobadas;
    }

}