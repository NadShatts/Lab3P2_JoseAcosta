/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_joseacosta;

/**
 *
 * @author josed
 */
public class GrassType extends Pokemon {
    
    String habitad;
    int dominio;

    public GrassType(String habitad, int dominio, String nombre, int numeroEntrada, String naturaleza, boolean atrapado, Pokeball pokemon) {
        super(nombre, numeroEntrada, naturaleza, atrapado, pokemon);
        this.habitad = habitad;
        this.dominio = dominio;
    }
    
    
}
