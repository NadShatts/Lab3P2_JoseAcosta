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
    ArrayList<Pokemon> pokemon = new ArrayList();

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
            System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:

                    int opcion2;
                    do {
                        System.out.println("Bienvenido a Ingresar Pokemon :) ");
                        System.out.println("Que tipo de Pokemon desea ingresar: ");
                        System.out.println("1. Pokemon Tipo Fuego");
                        System.out.println("2. Pokemon Tipo Agua");
                        System.out.println("3. Pokemon tipo Grass");
                        System.out.println("4. Salir");
                        System.out.println("Ingrese una opcion: ");
                        opcion2 = entrada.nextInt();

                        switch (opcion2) {
                            case 1:
                                System.out.println("Ingrese el nombre del Pokemon: ");
                                String nombreFuego = entrada.next();
                                System.out.println("Ingrese un numero de entrada: ");
                                int numeroEntradaFuego = entrada.nextInt();
                                System.out.println("Ingrese su naturaleza(Timido, Energetico, Misterioso): ");
                                String naturalezaFuego = entrada.next();
                                System.out.println("Ingrese su potencia en llama: ");
                                int potenciaLlama = entrada.nextInt();
                                pokemon.add(new FireType(potenciaLlama, nombreFuego, numeroEntradaFuego, naturalezaFuego, false, null));
                                System.out.println("Pokemon de fuego agregado exitosamente...");
                                break;

                            case 2:
                                System.out.println("Ingrese el nombre del Pokemon: ");
                                String nombreAgua = entrada.next();
                                System.out.println("Ingrese un numero de entrada: ");
                                int numeroEntradaAgua = entrada.nextInt();
                                System.out.println("Ingrese su naturaleza(Timido, Energetico, Misterioso): ");
                                String naturalezaAgua = entrada.next();
                                System.out.println("Puede vivir fuera del agua(true, false)");
                                boolean puedeVivir = entrada.nextBoolean();
                                System.out.println("Ingrese la rapidez: ");
                                int rapidez = entrada.nextInt();

                                pokemon.add(new WaterType(puedeVivir, rapidez, nombreAgua, numeroEntradaAgua, naturalezaAgua, false, null));
                                ;
                                System.out.println("Pokemon de agua agregado exitosamente...");
                                break;

                            case 3:
                                System.out.println("Ingrese el nombre del Pokemon: ");
                                String nombreGrass = entrada.next();
                                System.out.println("Ingrese un numero de entrada: ");
                                int numeroEntradaGrass = entrada.nextInt();
                                System.out.println("Ingrese su naturaleza(Timido, Energetico, Misterioso): ");
                                String naturalezaGrass = entrada.next();
                                System.out.println("Ingrese el habitad: ");
                                String habitad = entrada.next();
                                System.out.println("Ingrese el dominio(0-100): ");
                                int dominio = entrada.nextInt();

                                pokemon.add(new GrassType(habitad, dominio, nombreGrass, numeroEntradaGrass, naturalezaGrass, false, null));
                                System.out.println("Pokemon de planta agregado exitosamente...");
                            default:
                                System.out.println("Opcion invalida para la seleccion del pokemon...");
                        }
                    } while (opcion2 != 4);
                    break;
                case 2:
                    System.out.println("Bienvenido a crear su pokebola....");
                    System.out.println("Ingrese el color de su pokebola: ");
                    String color = entrada.next();
                    System.out.println("Ingrese el numero de serie: ");
                    int numeroSerie = entrada.nextInt();
                    System.out.println("Ingrese la efiencia de su pokeball(1-3): ");
                    int eficiencia = entrada.nextInt();

                    pokeball.add(new Pokeball(color, numeroSerie, eficiencia));
                    System.out.println("Pokeball agregada exitosamente....");
                    break;

                case 3:
                    if (pokemon.isEmpty()) {
                        System.out.println("No hay ningun pokemon ingresado hasta el momento...");
                    } else {
                        System.out.println("Lista de Pokémon por Tipo:");
                        System.out.println("Tipo Fuego:");
                        for (Pokemon p : pokemon) {
                            if (p instanceof FireType) {
                                System.out.println(p.toString());
                            }
                        }

                        System.out.println("Tipo Agua:");
                        for (Pokemon p : pokemon) {
                            if (p instanceof WaterType) {
                                System.out.println(p.toString());
                            }
                        }

                        System.out.println("Tipo Planta:");
                        for (Pokemon p : pokemon) {
                            if (p instanceof GrassType) {
                                System.out.println(p.toString());
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
                    if (pokemon.isEmpty() && pokeball.isEmpty()) {
                        System.out.println("No hay ningun pokemon o pokeball registrada hasta el momento...");
                    } else {
                    }
                    if (pokeball.isEmpty()) {
                        System.out.println("No hay Pokébolas disponibles para capturar Pokémon");
                    } else {
                        System.out.println("Elige una Pokébola para intentar capturar al Pokémon:");
                        for (int i = 0; i < pokeball.size(); i++) {
                            System.out.println((i + 1) + ". " + pokeball.get(i).getColor() + " - Eficiencia: " + pokeball.get(i).getEficiencia());
                        }

                        int opcionPokebola = entrada.nextInt();

                        if (opcionPokebola < 1 || opcionPokebola > pokeball.size()) {
                            System.out.println("Opción de Pokébola inválida");
                        } else {
                            Random rand = new Random();
                            ArrayList<Pokemon> pokemonesDisponibles = new ArrayList<>();

                            for (Pokemon p : pokemon) {
                                if (!p.isAtrapado()) {
                                    pokemonesDisponibles.add(p);
                                }
                            }

                            if (pokemonesDisponibles.isEmpty()) {
                                System.out.println("No hay Pokémon disponibles para capturar en este momento");
                            } else {
                                Pokemon pokemonAtrapar = pokemonesDisponibles.get(rand.nextInt(pokemonesDisponibles.size()));
                                System.out.println("¡Ha aparecido un Pokémon! Es " + pokemonAtrapar.getNombre());

                                System.out.println("¿Deseas intentar capturarlo o huir del encuentro? (capturar/huir)");
                                String decision = entrada.next();

                                if (decision.equals("huir")) {
                                    System.out.println("Has huido del encuentro");
                                } else {
                                    int eficienciaPokebolaElegida = pokeball.get(opcionPokebola - 1).getEficiencia();
                                    int chanceCaptura = rand.nextInt(3) + 1;

                                    if (chanceCaptura <= eficienciaPokebolaElegida) {
                                        pokemonAtrapar.setAtrapado(true);
                                        pokemonAtrapar.setPokemon(pokeball.get(opcionPokebola - 1));
                                        System.out.println("¡Has capturado a " + pokemonAtrapar.getNombre() + " con éxito!");
                                        pokeball.remove(opcionPokebola - 1);
                                    } else {
                                        System.out.println("No has logrado capturar a " + pokemonAtrapar.getNombre());
                                        pokeball.remove(opcionPokebola - 1);
                                    }
                                }
                            }
                        }
                    }

                    break;

                case 6:
                    if (pokemon.isEmpty()) {
                        System.out.println("No hay ningun pokemon registrado hasta el momento....");
                    } else {
                        int opcion3;
                        System.out.println("Bienvenido a modificar su pokemon....");
                        System.out.println("Ingrese que tipo de Pokemon desea modificar: ");
                        System.out.println("1. Pokemon tipo Fuego");
                        System.out.println("2. Pokemon tipo Agua");
                        System.out.println("3. Pokemon tipo Grass");
                        System.out.println("Ingrese una opcion: ");
                        opcion3 = entrada.nextInt();

                        switch (opcion3) {
                            case 1:

                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Ingrese una opcion valida para el menu");
                        }
                    }
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
