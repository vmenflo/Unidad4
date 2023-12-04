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
    // Atributos encapsulados --> getter / setter
    private String matricula;
    private String marca;
    private double velocidad;
    
    // Métodos - acciones
    // Método constructor, se llama igual que la clase, siempre es publico
    // No devuelve valor, puede tener parámetros
    
    public vehiculo(String matricula, String marca, double velocidad){
        this.matricula=matricula;
        this.marca=marca;
        this.velocidad=velocidad;
        
        
    }
    // Getter y Setter son public
    //Métodos get --> sirven para obtener datos
    
    public String getMatricula() {
        return this.matricula;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public double getVelocidad () {
        return this.velocidad;
    }
    
    // Método set--> Sirven para establecer datos en los atributos
    
    public void setMatricula(String matricula) {
        this.matricula=matricula;
    }
    
    public void setMarca(String marca) {
        this.marca=marca;
    }
    
    public void setVelocidad (double velocidad){
        this.velocidad = velocidad;
    }
    
    
    /** PARA HACERLO DE FORMA AUTOMATICA
     * 
     * // Insert code -- getter y setter -- encapsulate para hacerlos privados
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    // asi muestra todos los datos
    //@Override
    //public String toString() {
        //return "vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", velocidad=" + velocidad + '}';
        
        // Es preferible use string builder

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("vehiculo{");
        sb.append("matricula=").append(matricula);
        sb.append(", marca=").append(marca);
        sb.append(", velocidad=").append(velocidad);
        sb.append('}');
        return sb.toString();
    }
     */
}
