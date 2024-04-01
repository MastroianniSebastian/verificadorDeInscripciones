package org.example;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MateriaTest {

    private final Materia algoritmos = new Materia(Set.of());
    private final Materia pdep = new Materia(Set.of(algoritmos));

    private final Alumno alumnoQueCumple = new Alumno(Set.of(algoritmos,pdep));

    private final Alumno alumnoQueNoCumple = new Alumno(Set.of());

    @Test
    void unAlumnoPuedeNoCumplirConLasCorrelativasDeUnaMateria(){



        assertTrue(algoritmos.cumpleConCorrelativas(alumnoQueCumple));
        assertTrue(algoritmos.cumpleConCorrelativas(alumnoQueNoCumple));
        assertFalse(pdep.cumpleConCorrelativas(alumnoQueNoCumple));
        assertTrue(pdep.cumpleConCorrelativas(alumnoQueCumple));


    }
}
