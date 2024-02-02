/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_joseacosta;

/**
 *
 * @author josed
 */
public class FireType extends Pokemon {
    
    int potenciaLlamas;

        public FireType(int potenciaLlamas, String nombre, int numeroEntrada, String naturaleza, boolean atrapado, Pokeball pokeball) {
        super(nombre, numeroEntrada, naturaleza, atrapado, pokeball);
        this.potenciaLlamas = potenciaLlamas;
    }

    public int getPotenciaLlamas() {
        return potenciaLlamas;
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

    public void setPotenciaLlamas(int potenciaLlamas) {
        this.potenciaLlamas = potenciaLlamas;
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
        return "FireType:  Nombre: "+getNombre()+ " | Numero de entrada: " +getNumeroEntrada()+ " | Naturaleza: "+getNaturaleza()+ " | Atrapado: "+getAtrapado()+ " | Potencia de Llamas: " +getPotenciaLlamas()+ " | Pokeball: " +getPokemon();
    }

    
   
}
