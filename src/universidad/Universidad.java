/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author Johann Lopez
 */
import java.util.List;
import java.util.ArrayList;

public class Universidad {
    
    private String nombreU;
    private String nombreRector;
    private String ciudadU;
    private List<Facultad> facultades;

    // Constructor, getters y setters
    public Universidad(String nombreU, String nombreRector, String ciudadU) {
        this.nombreU = nombreU;
        this.nombreRector = nombreRector;
        this.ciudadU = ciudadU;
        this.facultades = new ArrayList<>();
    }

    // Getters y setters
    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getNombreRector() {
        return nombreRector;
    }

    public void setNombreRector(String nombreRector) {
        this.nombreRector = nombreRector;
    }

    public String getCiudadU() {
        return ciudadU;
    }

    public void setCiudadU(String ciudadU) {
        this.ciudadU = ciudadU;
    }

    public List<Facultad> getFacultades() {
        return facultades;
    }

    public void setFacultades(List<Facultad> facultades) {
        this.facultades = facultades;
    }
    
}
