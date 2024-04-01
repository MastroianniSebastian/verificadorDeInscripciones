package org.example;

import java.util.Set;

public class Inscripcion {

    private Set<Materia> materiasAInscribir;

    private Alumno alumnoAInscribir;

    public Inscripcion(Set<Materia> materiasAInscribir, Alumno alumnoAInscribir) {
        this.materiasAInscribir = materiasAInscribir;
        this.alumnoAInscribir = alumnoAInscribir;
    }

    public boolean aprobada(){
        return materiasAInscribir.stream().allMatch(unaMateria -> unaMateria.cumpleConCorrelativas(alumnoAInscribir));
    }
}
