package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Materia {

    private Set<Materia> materiasPreviasObligatorias = new HashSet<Materia>();


    public boolean cumpleConCorrelativas(Alumno alumno){
        return alumno.getMateriasAprobadas().containsAll(materiasPreviasObligatorias);
    }

    public Materia(Set<Materia> materiasPreviasObligatorias) {
        this.materiasPreviasObligatorias = materiasPreviasObligatorias;
    }
}
