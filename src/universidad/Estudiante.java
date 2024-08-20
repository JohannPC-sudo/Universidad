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

public class Estudiante extends Persona{
    
    private String colegioEstudiante;
    private String fechaMatricula;
    private List<Carrera> carreras;

    // Constructor
    public Estudiante(String NIF, String nombre, String apellido1, String apellido2, String fechaNac, String colegioEstudiante, String fechaMatricula) {
        super(NIF, nombre, apellido1, apellido2, fechaNac);
        this.colegioEstudiante = colegioEstudiante;
        this.fechaMatricula = fechaMatricula;
        this.carreras = new ArrayList<>();
    }

    // Método
    public void matriculado() {
        // Implementación del método matriculado
    }

    // Getters y setters
    public String getColegioEstudiante() {
        return colegioEstudiante;
    }

    public void setColegioEstudiante(String colegioEstudiante) {
        this.colegioEstudiante = colegioEstudiante;
    }

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }
}
   


    

