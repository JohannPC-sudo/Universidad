/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author Johann Lopez
 */
    public class Persona {
    
    private String NIF;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String fechaNac;

    // Constructor
    public Persona(String NIF, String nombre, String apellido1, String apellido2, String fechaNac) {
        this.NIF = NIF;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNac = fechaNac;
    }

    // Getters y setters
    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    // Métodos
    public void registrar() {
        // Implementación del método registrar
    }

    public void actualizar() {
        // Implementación del método actualizar
    }

    public void eliminar() {
        // Implementación del método eliminar
    }
      
    // Getters y setters
}
        


    


    

    

