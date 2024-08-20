/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidad;

/**
 *
 * @Johann Lopez
 */
public class SistemaUniversidad {
     
    public static void main(String[] args) {
        
        // Crear el rector
        Rector rector = new Rector("12345678", "Johann", "lopez", "Lenis", "01/01/1960", "Doctorado en Educación", 10000.0f);

        // Crear la universidad
        Universidad universidad = new Universidad("Universidad Ean", rector.getNombre(), "Ciudad Bogota");

        // Crear la facultad
        Facultad facultad = new Facultad("Ingeniería", "Ciudad Ejemplo");

        // Crear el profesor
        Profesor profesor = new Profesor("23456789", "Ana", "Gómez", "López", "01/01/1980", "Ingeniera", 5);

        // Crear la carrera
        Carrera carrera = new Carrera("Ingeniería de Sistemas", 160, 8, NivelCarrera.PREGRADO, facultad);

        // Crear el estudiante
        Estudiante estudiante = new Estudiante("87654321", "Carlos", "López", "Martínez", "15/05/2000", "Colegio Ejemplo", "01/08/2018");

        // Agregar el profesor a la facultad
        facultad.getProfesores().add(profesor);

        // Agregar la carrera a la facultad
        facultad.getCarreras().add(carrera);

        // Agregar el estudiante a la carrera
        carrera.getEstudiantes().add(estudiante);

        // Agregar la facultad a la universidad
        universidad.getFacultades().add(facultad);

        // Imprimir información de la universidad
        System.out.println("Universidad: " + universidad.getNombreU());
        System.out.println("Rector: " + universidad.getNombreRector());
        System.out.println("Ciudad: " + universidad.getCiudadU());
        
    }
}
  
        
       


    
        
        
       
    
    

