/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Utilidades {

    // Método de clase publico (visible por otras clases)
    // Estatic no necesita de objeto de la clase Utilidades
    // devuelve un dato tipo int - implica un return dentro del método
    // nombre del método
    // EL metodo no tiene parámetros
    public static int solicitarDatoInt() {
        Scanner teclado = new Scanner(System.in);

        boolean seguir = true;
        int dato = 0;

        do {
            try {
                System.out.println("Introduce un número: ");
                dato = teclado.nextInt();
                seguir = false;
            } catch (InputMismatchException ime) {
                System.out.println("No has introducido un número ... ");
            }
            teclado.nextLine();
        } while (seguir);
        return dato;
    }

    // Metodo que filtra datos entre menor y mayor
    public static int filtrarEnterosEntre(int menor, int mayor) {

        int numero;
        do {
            // Al usar un método que esta dentro de la propia clase
            // no es necesario poner el nombre de la clase

            numero = solicitarDatoInt();
            if (numero > mayor || numero < menor) {
                System.out.println("El número no esta en el rango "
                        + menor + "-" + mayor);
            }
            
        } while (!(numero>menor&&numero<mayor)); 
        // Repitete mientras numero no sea mayor que menor y menor que mayor
        return numero;
    }
    
    
    // Método para obtener un entero aleatorio entre dos números
    
    public static int enteroAleatorio(int menor, int mayor){
        Random r = new Random();
        return r.nextInt(menor, mayor+1);
    }

}
