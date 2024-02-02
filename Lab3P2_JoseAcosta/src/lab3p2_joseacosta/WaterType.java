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

    public boolean getVivir() {
        return vivir;
    }

    public int getRapidez() {
        return rapidez;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroEntrada() {
        return numeroEntrada;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public boolean getAtrapado() {
        return atrapado;
    }

    public Pokeball getPokemon() {
        return pokemon;
    }

    @Override
    public String toString() {
        return "WaterType:  Nombre: "+getNombre()+ " | Numero de entrada: " +getNumeroEntrada()+ " | Naturaleza: "+getNaturaleza()+ " | Atrapado: "+getAtrapado()+ " | Vive fuera del agua: "+getVivir() + " | Rapidez: " +getRapidez();
    }
    
    
    
}
