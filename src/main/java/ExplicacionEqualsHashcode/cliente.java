/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExplicacionEqualsHashcode;

import java.util.Objects;

/**
 *
 * @author victor
 */
public class cliente {
    
    
   private String nombre;
   private int edad;
   private String direccion;
   private String email;

    public cliente(String nombre, int edad, String direccion, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //Es necesario el hashCode y Equals para comparar objetos
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + this.edad;
        hash = 97 * hash + Objects.hashCode(this.direccion);
        hash = 97 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }// si las dos direcciones de memoria apuntan al mismo sitio es true
        if (obj == null) {
            return false;
        }// Si es null, no se puede comparar es falso
        if (getClass() != obj.getClass()) {
            return false;
        }// Si las clases de los objetos es distinta es false
        final cliente other = (cliente) obj; //Es un casting entre objetos
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        return Objects.equals(this.email, other.email);
    }
   
   
   
    
}
