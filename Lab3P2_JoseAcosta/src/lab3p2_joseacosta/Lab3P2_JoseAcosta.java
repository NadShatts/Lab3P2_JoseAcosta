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
     */ArrayList <Pokemon> pokemon = new ArrayList();
    public static void main(String[] args) {
        
        ArrayList <Pokemon> pokemon = new ArrayList();
        ArrayList<Pokeball> pokeball = new ArrayList<>();
        
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
                    int opcion2;
                    System.out.println("Bienvenido a Ingresar Pokemon :) ");
                    System.out.println("Que tipo de Pokemon desea ingresar: ");
                    System.out.println("1. Pokemon Tipo Fuego");
                    System.out.println("2. Pokemon Tipo Agua");
                    System.out.println("3. Pokemon tipo Grass");
                    System.out.println("4. Salir");
                    System.out.println("Ingrese una opcion: ");
                    opcion2 = entrada.nextInt();
                    
                    do{
                        
                    
                    System.out.println("Ingrese el nombre del Pokemon: ");
                            String nombre = entrada.next();
                            System.out.println("Ingrese un numero de entrada: ");
                            int numeroEntrada = entrada.nextInt();
                            System.out.println("Ingrese su naturaleza(Timido, Energetico, Misterioso): ");
                            String naturaleza = entrada.next();
                            
                    switch(opcion2){
                        case 1:
                            System.out.println("Ingrese su potencia en llama: ");
                            int potenciaLlama = entrada.nextInt();
                            pokemon.add(new FireType(nombre, numeroEntrada, naturaleza, potenciaLlama));
                            System.out.println("Pokemon de fuego agregado exitosamente...");
                    
                case 2:
                    System.out.println("Puede vivir fuera del agua(si, no)");
                    boolean puedeVivir = entrada.nextBoolean();
                    System.out.println("Ingrese la rapidez: ");
                    int rapidez = entrada.nextInt();
                    
                    pokemon.add(new WaterType(nombre, numeroEntrada, naturaleza, puedeVivir, rapidez));
                    System.out.println("Pokemon de agua agregado exitosamente...");
                    break;
                    
                case 3:
                    System.out.println("Ingrese el habitad: ");
                    String habitad = entrada.next();
                    System.out.println("Ingrese el dominio(0-100): ");
                    int dominio = entrada.nextInt();
                    
                    pokemon.add(new GrassType(nombre, numeroEntrada, naturaleza, habitad, dominio));
                default:
                    System.out.println("Opcion invalida para la seleccion del pokemon...");
                    }
                    }while(opcion2!=4);
                    break;
                case 2:
                    System.out.println("Bienvenido a crear su pokebola....");
                    System.out.println("Ingrese el color de su pokebola: ");
                    String color = entrada.next();
                    System.out.println("Ingrese el numero de serie: ");
                    int numeroSerie = entrada.nextInt();
                    System.out.println("Ingrese la efiencia de su pokeball(1-3): ");
                    int eficiencia = entrada.nextInt();
                    
                    pokeball.add(new Pokeball(color,numeroSerie, eficiencia));
                    System.out.println("Pokeball agregada exitosamente....");                  
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
