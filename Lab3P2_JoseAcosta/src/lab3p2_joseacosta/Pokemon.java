/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_joseacosta;

/**
 *
 * @author josed
 */
public class Pokemon {
    
   String nombre;
   int numeroEntrada;
   String naturaleza;
   boolean atrapado;
   Pokeball pokemon;

    public Pokemon(String nombre, int numeroEntrada, String naturaleza, boolean atrapado, Pokeball pokemon) {
        this.nombre = nombre;
        this.numeroEntrada = numeroEntrada;
        this.naturaleza = naturaleza;
        this.atrapado = atrapado;
        this.pokemon = pokemon;
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

    public boolean isAtrapado() {
        return atrapado;
    }

    public Pokeball getPokemon() {
        return pokemon;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroEntrada(int numeroEntrada) {
        this.numeroEntrada = numeroEntrada;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public void setAtrapado(boolean atrapado) {
        this.atrapado = atrapado;
    }

    public void setPokemon(Pokeball pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", numeroEntrada=" + numeroEntrada + ", naturaleza=" + naturaleza + ", atrapado=" + atrapado + ", pokemon=" + pokemon + '}';
    }
   
   
}
