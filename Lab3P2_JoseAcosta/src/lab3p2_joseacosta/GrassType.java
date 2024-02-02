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

    public String getHabitad() {
        return habitad;
    }

    public int getDominio() {
        return dominio;
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

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public void setDominio(int dominio) {
        this.dominio = dominio;
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
        return "GrassType:  Nombre: "+getNombre()+ " | Numero de entrada: " +getNumeroEntrada()+ " | Habitad: " +getHabitad()+ " | Dominio:" +getDominio();
    }
    
    
    
}
