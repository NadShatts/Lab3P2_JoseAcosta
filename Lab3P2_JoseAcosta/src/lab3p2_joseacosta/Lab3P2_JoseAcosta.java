/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_joseacosta;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josed
 */
public class Lab3P2_JoseAcosta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList <Pokemon> pokemon = new ArrayList();
        
        Scanner entrada = new Scanner(System.in);
        
        int opcion;
        
        do{
            System.out.println("Menu Principal");
            System.out.println("1. Crear Pokemon");
            System.out.println("2. Crear Pokebola");
            System.out.println("3. Listar Pokemon");
            System.out.println("4. Eliminar Pokemon");
            System.out.println("5. Capturar Pokemon");
            System.out.println("6. Modificar Pokemon");
            System.out.println("7. Salir.");
            System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    break;
                    
                case 2:
                    break;
                    
                case 3:
                    break;
                    
                case 4:
                    break;
                    
                case 5:
                    break;
                    
                case 6:
                    break;
                    
                case 7:
                    System.out.println("Saliendo del Menu de los pokemons..");
                    break;
                    
                default:
                    System.out.println("Opcion invalida. Intentelo denuevo");
            }
        }while(opcion!=7);
    }
    
}
