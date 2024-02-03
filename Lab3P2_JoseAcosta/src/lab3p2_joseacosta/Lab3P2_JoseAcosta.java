/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_joseacosta;

import java.util.ArrayList;
import java.util.Random;
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

        ArrayList<Pokemon> pokemon = new ArrayList();
        ArrayList<Pokeball> pokeball = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Menu Principal");
            System.out.println("1. Crear Pokemon");
            System.out.println("2. Crear Pokebola");
            System.out.println("3. Listar Pokemon");
            System.out.println("4. Eliminar Pokemon");
            System.out.println("5. Capturar Pokemon");
            System.out.println("6. Modificar Pokemon");
            System.out.println("7. Salir.");
            System.out.print("Ingrese una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:

                    int opcion2;
                    do {
                        System.out.println("Bienvenido a Ingresar Pokemon :) ");
                        System.out.println("¿Que tipo de Pokemon desea ingresar?: ");
                        System.out.println("1. Pokemon Tipo Fuego");
                        System.out.println("2. Pokemon Tipo Agua");
                        System.out.println("3. Pokemon tipo Grass");
                        System.out.println("4. Salir");
                        System.out.print("Ingrese una opcion: ");
                        opcion2 = entrada.nextInt();

                        switch (opcion2) {
                            case 1:
                                System.out.print("Ingrese el nombre del Pokemon: ");
                                String nombreFuego = entrada.next();
                                System.out.print("Ingrese un numero de entrada: ");
                                int numeroEntradaFuego = entrada.nextInt();
                                String naturalezaFuego;
                                do {
                                    System.out.print("Ingrese su naturaleza (timido, energetico, miseterioso): ");
                                    naturalezaFuego = entrada.next();
                                    if (!(naturalezaFuego.equalsIgnoreCase("timido") || naturalezaFuego.equalsIgnoreCase("energetico") || naturalezaFuego.equalsIgnoreCase("misterioso"))) {
                                        System.out.println("Naturaleza inválida. Por favor, ingrese timido, energetico o misterioso.");
                                    }
                                } while (!(naturalezaFuego.equalsIgnoreCase("timido") || naturalezaFuego.equalsIgnoreCase("energetico") || naturalezaFuego.equalsIgnoreCase("misterioso")));
                                System.out.print("Ingrese su potencia en llama: ");
                                int potenciaLlama = entrada.nextInt();
                                pokemon.add(new FireType(potenciaLlama, nombreFuego, numeroEntradaFuego, naturalezaFuego, false, null));
                                System.out.println("Pokemon de fuego agregado exitosamente...");
                                break;

                            case 2:
                                System.out.print("Ingrese el nombre del Pokemon: ");
                                String nombreAgua = entrada.next();
                                System.out.print("Ingrese un numero de entrada: ");
                                int numeroEntradaAgua = entrada.nextInt();
                                String naturalezaAgua;
                                do {
                                    System.out.print("Ingrese su naturaleza (timido, energetico, miseterioso): ");
                                    naturalezaAgua = entrada.next();
                                    if (!(naturalezaAgua.equalsIgnoreCase("timido") || naturalezaAgua.equalsIgnoreCase("energetico") || naturalezaAgua.equalsIgnoreCase("misterioso"))) {
                                        System.out.println("Naturaleza inválida. Por favor, ingrese timido, energetico o misterioso.");
                                    }
                                } while (!(naturalezaAgua.equalsIgnoreCase("timido") || naturalezaAgua.equalsIgnoreCase("energetico") || naturalezaAgua.equalsIgnoreCase("misterioso")));
                                System.out.print("Puede vivir fuera del agua(true, false): ");
                                boolean puedeVivir = entrada.nextBoolean();
                                System.out.print("Ingrese la rapidez: ");
                                int rapidez = entrada.nextInt();

                                pokemon.add(new WaterType(puedeVivir, rapidez, nombreAgua, numeroEntradaAgua, naturalezaAgua, false, null));
                                ;
                                System.out.println("Pokemon de agua agregado exitosamente...");
                                break;

                            case 3:
                                System.out.print("Ingrese el nombre del Pokemon: ");
                                String nombreGrass = entrada.next();
                                System.out.print("Ingrese un numero de entrada: ");
                                int numeroEntradaGrass = entrada.nextInt();
                                String naturalezaGrass;
                                do {
                                    System.out.print("Ingrese su naturaleza (timido, energetico, miseterioso): ");
                                    naturalezaGrass = entrada.next();
                                    if (!(naturalezaGrass.equalsIgnoreCase("timido") || naturalezaGrass.equalsIgnoreCase("energetico") || naturalezaGrass.equalsIgnoreCase("misterioso"))) {
                                        System.out.println("Naturaleza inválida. Por favor, ingrese timido, energetico o misterioso.");
                                    }
                                } while (!(naturalezaGrass.equalsIgnoreCase("timido") || naturalezaGrass.equalsIgnoreCase("energetico") || naturalezaGrass.equalsIgnoreCase("misterioso")));
                                System.out.print("Ingrese el habitad: ");
                                String habitad = entrada.next();
                                int dominio;
                                do {
                                    System.out.print("Ingrese el dominio (0-100): ");
                                    while (!entrada.hasNextInt()) {
                                        System.out.println("Por favor, ingrese un número válido.");
                                        entrada.next();
                                    }
                                    dominio = entrada.nextInt();
                                    if (dominio < 0 || dominio > 100) {
                                        System.out.println("El dominio debe estar en el rango de 0 a 100.");
                                    }
                                } while (dominio < 0 || dominio > 100);

                                pokemon.add(new GrassType(habitad, dominio, nombreGrass, numeroEntradaGrass, naturalezaGrass, false, null));
                                System.out.println("Pokemon de planta agregado exitosamente...");
                            default:
                                System.out.println("Opcion invalida para la seleccion del pokemon...");
                        }
                    } while (opcion2 != 4);
                    break;
                case 2:
                    System.out.println("Bienvenido a crear su pokebola....");
                    System.out.print("Ingrese el color de su pokebola: ");
                    String color = entrada.next();
                    System.out.print("Ingrese el numero de serie: ");
                    int numeroSerie = entrada.nextInt();
                    int eficiencia;
                    do {
                        System.out.print("Ingrese la eficiencia de su Pokébola (1-3): ");
                        while (!entrada.hasNextInt()) {
                            System.out.println("Por favor, ingrese un número válido.");
                            entrada.next();
                        }
                        eficiencia = entrada.nextInt();
                        if (eficiencia < 1 || eficiencia > 3) {
                            System.out.println("La eficiencia debe estar en el rango de 1 a 3.");
                        }
                    } while (eficiencia < 1 || eficiencia > 3);

                    pokeball.add(new Pokeball(color, numeroSerie, eficiencia));
                    System.out.println("Pokeball agregada exitosamente....");
                    break;

                case 3:
                    if (pokemon.isEmpty()) {
                        System.out.println("No hay ningun pokemon ingresado hasta el momento...");
                    } else {
                        System.out.println("Su lista actual de Pokemons es la siguiente: ");
                        System.out.println("");

                        System.out.println("Tipo Fuego:");
                        System.out.println("");
                        for (Pokemon p : pokemon) {
                            if (p instanceof FireType) {

                                System.out.println(p.toString());
                                System.out.println("");

                            }
                        }

                        System.out.println("Tipo Agua:");
                        System.out.println("");
                        for (Pokemon p : pokemon) {
                            if (p instanceof WaterType) {

                                System.out.println(p.toString());
                                System.out.println("");
                            }
                        }

                        System.out.println("Tipo Planta:");
                        System.out.println("");
                        for (Pokemon p : pokemon) {
                            if (p instanceof GrassType) {

                                System.out.println(p.toString());
                                System.out.println("");
                            }
                        }
                    }

                    break;

                case 4:
                    if (pokemon.isEmpty()) {
                        System.out.println("No hay ningún Pokémon ingresado hasta el momento...");
                    } else {
                        System.out.println("Seleccione el tipo de Pokémon que desea eliminar:");
                        System.out.println("1. Tipo Fuego");
                        System.out.println("2. Tipo Agua");
                        System.out.println("3. Tipo Planta");
                        System.out.println("Ingrese una opcion para eliminar: ");
                        int tipoEliminar = entrada.nextInt();

                        switch (tipoEliminar) {
                            case 1:
                                System.out.println("Pokémon Tipo Fuego:");
                                int contadorFuego = 1;
                                for (int i = 0; i < pokemon.size(); i++) {
                                    if (pokemon.get(i) instanceof FireType) {
                                        System.out.println(contadorFuego + ". " + pokemon.get(i).toString());
                                        contadorFuego++;
                                    }
                                }
                                System.out.print("Ingrese el numero del pokemon a eliminar: ");
                                int indiceEliminarFuego = entrada.nextInt();
                                if (indiceEliminarFuego > 0 && indiceEliminarFuego <= contadorFuego - 1) {
                                    int indiceReal = 0;
                                    for (int i = 0; i < pokemon.size(); i++) {
                                        if (pokemon.get(i) instanceof FireType) {
                                            if (indiceEliminarFuego == 1) {
                                                System.out.println("Su pokemon de fuego ha sido eliminado correctamente....");
                                                pokemon.remove(i);
                                                break;
                                            }
                                            indiceEliminarFuego--;

                                        }
                                    }
                                } else {
                                    System.out.println("Índice inválido");
                                }
                                break;

                            case 2:
                                System.out.println("Pokémon Tipo Agua:");
                                int contadorAgua = 1;
                                for (int i = 0; i < pokemon.size(); i++) {
                                    if (pokemon.get(i) instanceof WaterType) {
                                        System.out.println(contadorAgua + ". " + pokemon.get(i).toString());
                                        contadorAgua++;
                                    }
                                }
                                System.out.print("Ingrese el numero del pokemon a eliminar: ");
                                int indiceEliminarAgua = entrada.nextInt();
                                if (indiceEliminarAgua > 0 && indiceEliminarAgua <= contadorAgua - 1) {
                                    int indiceReal = 0;
                                    for (int i = 0; i < pokemon.size(); i++) {
                                        if (pokemon.get(i) instanceof WaterType) {
                                            if (indiceEliminarAgua == 1) {
                                                System.out.println("Su pokemon de Agua ha sido eliminado correctamente....");
                                                pokemon.remove(i);
                                                break;
                                            }
                                            indiceEliminarAgua--;

                                        }
                                    }
                                } else {
                                    System.out.println("Índice inválido");
                                }
                                break;

                            case 3:
                                System.out.println("Pokémon Tipo Planta:");
                                int contadorPlanta = 1;
                                for (int i = 0; i < pokemon.size(); i++) {
                                    if (pokemon.get(i) instanceof GrassType) {
                                        System.out.println(contadorPlanta + ". " + pokemon.get(i).toString());
                                        contadorPlanta++;
                                    }
                                }
                                System.out.print("Ingrese el numero del pokemon a eliminar: ");
                                int indiceEliminarPlanta = entrada.nextInt();
                                if (indiceEliminarPlanta > 0 && indiceEliminarPlanta <= contadorPlanta - 1) {
                                    int indiceReal = 0;
                                    for (int i = 0; i < pokemon.size(); i++) {
                                        if (pokemon.get(i) instanceof GrassType) {
                                            if (indiceEliminarPlanta == 1) {
                                                System.out.println("Su pokemon de Tierra o Grass ha sido eliminado correctamente....");
                                                pokemon.remove(i);

                                                break;
                                            }
                                            indiceEliminarPlanta--;
                                        }
                                    }
                                } else {
                                    System.out.println("Índice inválido");
                                }
                                break;

                            default:
                                System.out.println("Tipo de Pokémon no válido.");
                                break;
                        }
                    }
                    break;

                case 5:
                    if (pokemon.isEmpty()) {
                        System.out.println("No hay ningún Pokemon para capturar. Ingrese en la opción 1.");
                    } else if (pokeball.isEmpty()) {
                        System.out.println("No hay Pokébolas disponibles para capturar Pokémon");
                    } else {
                        System.out.println("Pokebolas disponibles para capturar a los pokemons: ");
                        for (int i = 0; i < pokeball.size(); i++) {
                            System.out.println((i + 1) + ". " + pokeball.get(i).getColor() + " | Eficiencia: " + pokeball.get(i).getEficiencia());
                        }
                        System.out.print("Ingrese el número de su pokeball: ");
                        int opcionPokebola = entrada.nextInt();

                        if (opcionPokebola < 1 || opcionPokebola > pokeball.size()) {
                            System.out.println("Opción de Pokébola inválida....");
                        } else {
                            Random r = new Random();
                            int indicePokemon = -1;

                            for (int i = 0; i < pokemon.size(); i++) {
                                if (!pokemon.get(i).getAtrapado()) {
                                    indicePokemon = i;
                                    break;
                                }
                            }

                            if (indicePokemon == -1) {
                                System.out.println("No hay Pokemones salvajes disponibles para capturar");
                            } else {
                                Pokemon atrapar = pokemon.get(indicePokemon);
                                System.out.println("¡Ha aparecido un Pokémon! Se trata de " + atrapar.getNombre());

                                System.out.println("¿Deseas intentar capturarlo o huir del encuentro?");
                                System.out.println("1. Capturarlo");
                                System.out.println("2. Huir");
                                System.out.print("Ingrese una opcion: ");
                                int decision = entrada.nextInt();

                                switch (decision) {
                                    case 1:
                                        int pokeballElegida = pokeball.get(opcionPokebola - 1).getEficiencia();
                                        int chanceCaptura = r.nextInt(3) + 1;

                                        if (chanceCaptura <= pokeballElegida) {
                                            atrapar.setAtrapado(true);
                                            atrapar.setPokemon(pokeball.get(opcionPokebola - 1));
                                            System.out.println("¡Has capturado a " + atrapar.getNombre() + " con éxito!");
                                            pokeball.remove(opcionPokebola - 1);
                                        } else {
                                            System.out.println("No has logrado capturar a " + atrapar.getNombre());
                                            pokeball.remove(opcionPokebola - 1);
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Has huido del encuentro!! Cobardeee");
                                        break;
                                    default:
                                        System.out.println("Opción inválida. Volviendo al menú principal.");
                                }
                            }
                        }
                    }

                    break;

                case 6:
                    break;

                case 7:
                    System.out.println("Saliendo del Menu de los pokemons..");
                    break;

                default:
                    System.out.println("Opcion invalida. Intentelo denuevo");
            }
        } while (opcion != 7);
    }

}
