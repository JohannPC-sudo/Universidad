/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @Johann Lopez
 */
import java.util.List;
import java.util.ArrayList;

public class Profesor extends Persona{
    
    private String profesion;
    private int vinculacion;
    private List<Curso> cursos;

    // Constructor
    public Profesor(String NIF, String nombre, String apellido1, String apellido2, String fechaNac, String profesion, int vinculacion) {
        super(NIF, nombre, apellido1, apellido2, fechaNac);
        this.profesion = profesion;
        this.vinculacion = vinculacion;
        this.cursos = new ArrayList<>();
    }

    // Getters y setters
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getVinculacion() {
        return vinculacion;
    }

    public void setVinculacion(int vinculacion) {
        this.vinculacion = vinculacion;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    // Getters y setters
}

