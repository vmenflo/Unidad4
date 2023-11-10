/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author victor
 */

// Definicion de la clase (satic, extens, abstract, etc
public class vehiculo {
    
    // Dentro de una clase hay 2 cosas: Atributos y Metodos
    // Atributos - características 
    String matricula;
    String marca;
    double velocidad;
    
    // Métodos - acciones
    // Método constructor, se llama igual que la clase, siempre es publico
    // No devuelve valor, puede tener parámetros
    
    public vehiculo(String matricula, String marca, double velocidad){
        this.matricula=matricula;
        this.marca=marca;
        this.velocidad=velocidad;
        
        
    }
    
}
