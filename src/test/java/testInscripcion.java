import Clases.Alumno;
import Clases.Inscripcion;
import Clases.Materia;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class testInscripcion {

    @Test
    public void inscripciones() {
        Materia algoritmos = new Materia(082021, "Algoritmos y Estructuras de Datos");
        Materia paradigmas = new Materia(082026, "Paradigmas de Programación", List.of(algoritmos));
        Materia diseno = new Materia(082028, "Diseño de Sistemas", List.of(algoritmos), List.of(paradigmas));

        Alumno alumno = new Alumno(12345678, "Futuro Ingeniero", List.of(algoritmos), null);

        Inscripcion inscripcionAprobada = new Inscripcion(1, alumno, List.of(paradigmas));
        Inscripcion inscripcionRechazada = new Inscripcion(2, alumno, List.of(paradigmas, diseno));

        assertTrue(inscripcionAprobada.aprobada());
        assertFalse(inscripcionRechazada.aprobada());
    }

}