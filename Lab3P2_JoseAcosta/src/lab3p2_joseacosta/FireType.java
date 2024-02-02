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

    public FireType(int potenciaLlamas, String nombre, int numeroEntrada, String naturaleza, boolean atrapado, Pokeball pokemon) {
        super(nombre, numeroEntrada, naturaleza, atrapado, pokemon);
        this.potenciaLlamas = potenciaLlamas;
    }

    

    

    public FireType(String nombre, int numeroEntrada, String naturaleza) {
        super(nombre, numeroEntrada, naturaleza);
    }

    

    
    @Override
    public String toString() {
        return "FireType{" + "potenciaLlamas=" + potenciaLlamas + '}';
    }

    
   
}
