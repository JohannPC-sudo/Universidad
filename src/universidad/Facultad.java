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

        
public class Facultad {
    
    private String nombreF;
    private String ciudadF;
    private List<Profesor> profesores;
    private List<Carrera> carreras;

    // Constructor
    public Facultad(String nombreF, String ciudadF) {
        this.nombreF = nombreF;
        this.ciudadF = ciudadF;
        this.profesores = new ArrayList<>();
        this.carreras = new ArrayList<>();
    }

    // Getters y setters
    public String getNombreF() {
        return nombreF;
    }

    public void setNombreF(String nombreF) {
        this.nombreF = nombreF;
    }

    public String getCiudadF() {
        return ciudadF;
    }

    public void setCiudadF(String ciudadF) {
        this.ciudadF = ciudadF;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }   
    
}

    
    

