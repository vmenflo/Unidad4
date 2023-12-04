/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author victor
 */
public class pruebaVehiculo {
    
    public static void main (String[] args) {
        // Instanciación de un objeto
        // Reserva de espacio en memoria, dando valor a sus atributos
        
        vehiculo v1 = new vehiculo("7779KRK", "Bugati", 0);
        vehiculo v2 = new vehiculo("3333ppp", "Renualt", 100);
        
        System.out.println("Matricula v1: " + v1.getMatricula());;
        System.out.println("Matricula v2: " + v2.getMatricula());
        
        System.out.println("La velocidad de v2 es: " + v2.getVelocidad());
        
        // Modificamos la velocidad de v2 estableciendo 200kmh/h
        
        v2.setVelocidad(200);
        
        System.out.println("Velocidad v2: " + v2.getVelocidad());
    }
}
