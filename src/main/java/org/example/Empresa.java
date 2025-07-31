package org.example;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Departamentos> departamentos;
    
    public Empresa() {
        Departamentos dep_programacao = new Departamentos();
    }

    public void addDepartamentos(Departamentos dep) {
        departamentos.add(dep);
    }
}
