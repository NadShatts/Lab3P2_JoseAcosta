/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_joseacosta;

/**
 *
 * @author josed
 */
public class Pokeball {
 
    String color;
    int numeroSerie;
    int eficiencia;

    public Pokeball(String color, int numeroSerie, int eficiencia) {
        this.color = color;
        this.numeroSerie = numeroSerie;
        this.eficiencia = eficiencia;
    }
    
    

    public String getColor() {
        return color;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public int getEficiencia() {
        return eficiencia;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void setEficiencia(int eficiencia) {
        this.eficiencia = eficiencia;
    }
    
    
}
