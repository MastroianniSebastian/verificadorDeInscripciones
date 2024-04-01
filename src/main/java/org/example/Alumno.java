package org.example;

import java.util.Set;

public class Alumno {

    private Set<Materia> materiasAprobadas;

    public Set<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public Alumno(Set<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}
