/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_joseacosta;

/**
 *
 * @author josed
 */
public class WaterType extends Pokemon {
    
    boolean vivir;
    int rapidez;

    public WaterType(boolean vivir, int rapidez, String nombre, int numeroEntrada, String naturaleza, boolean atrapado, Pokeball pokemon) {
        super(nombre, numeroEntrada, naturaleza, atrapado, pokemon);
        this.vivir = vivir;
        this.rapidez = rapidez;
    }
    
    
}
