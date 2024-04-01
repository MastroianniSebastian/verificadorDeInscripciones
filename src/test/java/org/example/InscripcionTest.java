package org.example;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InscripcionTest {



    private final Materia algoritmos = new Materia(Set.of());
    private final Materia pdep = new Materia(Set.of(algoritmos));
    private final Materia disenio = new Materia(Set.of(pdep, algoritmos));

    private final Alumno alumnoAceptado = new Alumno(Set.of(algoritmos,pdep));

    private final Alumno alumnoRechazado = new Alumno(Set.of(algoritmos));


    @Test
    void unAlumnoConTodasLasMAteriasPreviasAprobadasPuedeInscribirse(){

        Inscripcion inscripcionAceptada = new Inscripcion(Set.of(disenio),alumnoAceptado);

        assertTrue(inscripcionAceptada.aprobada());


    }

    @Test
    void unAlumnoSinTodasLasMAteriasPreviasAprobadasPuedeInscribirse(){

        Inscripcion inscripcionAceptada = new Inscripcion(Set.of(disenio),alumnoRechazado);

        assertFalse(inscripcionAceptada.aprobada());


    }
}
