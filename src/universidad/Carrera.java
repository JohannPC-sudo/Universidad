/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author Usuario
 */
import java.util.List;
import java.util.ArrayList;

public class Carrera {
    
    // Método para obtener la lista de estudiantes
    public List<Estudiante> getEstudiantes() {
    return estudiantes;
    }
    private String nombre;
    private int creditosTotales;
    private int semestres;
    private NivelCarrera nivel;
    private Facultad facultad;
    private List<Curso> cursos;
    private List<Estudiante> estudiantes;

    // Constructor
    public Carrera(String nombre, int creditosTotales, int semestres, NivelCarrera nivel, Facultad facultad) {
        this.nombre = nombre;
        this.creditosTotales = creditosTotales;
        this.semestres = semestres;
        this.nivel = nivel;
        this.facultad = facultad;
        this.cursos = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    // Getters y setters   
}

    

