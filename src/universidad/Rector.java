/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @Johann Lopez
 */
public class Rector extends Persona {
    
    private String profesion;
    private float sueldo;

    // Constructor
    public Rector(String NIF, String nombre, String apellido1, String apellido2, String fechaNac, String profesion, float sueldo) {
        super(NIF, nombre, apellido1, apellido2, fechaNac);
        this.profesion = profesion;
        this.sueldo = sueldo;
    }

    // Getters y setters
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    // Método getter para el nombre
    public String getNombre() {
        return super.getNombre();
    }    
}


    

