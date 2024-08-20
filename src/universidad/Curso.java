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

public class Curso {
    
    private int codigo;
    private String nombre;
    private int creditos;
    private int salon;
    private String edificio;
    private List<Profesor> profesores;
    private List<Estudiante> estudiantes;
    private Carrera carrera;
    
    // Constructor, getters y setters
    public Curso(int codigo, String nombre, int creditos, int salon, String edificio, Carrera carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.salon = salon;
        this.edificio = edificio;
        this.carrera = carrera;
        this.profesores = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    // Getters y setters
}

    

