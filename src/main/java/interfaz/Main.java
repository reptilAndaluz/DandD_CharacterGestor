package interfaz;

import logica.Attributes;
import logica.PJ;
import implementacion.CharacterManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CharacterManager manager = new CharacterManager();
        boolean salir = false;

        System.out.println("=== D&D CHARACTER GESTOR 5e ===");

        while (!salir) {
            System.out.println("\n1. Crear Personaje");
            System.out.println("2. Buscar Personaje");
            System.out.println("3. Listar todos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            int opcion = leerEntero(sc);

            switch (opcion) {
                case 1:
                    // --- BLOQUE DE CREACIÓN ---
                    System.out.print("\nNombre del héroe: ");
                    String nombre = sc.nextLine();
                    System.out.print("Nivel (1-20): ");
                    int nivel = leerEntero(sc);

                    PJ nuevoPJ = new PJ(nombre, nivel);

                    System.out.println("Introduce las puntuaciones de atributo (8-20):");
                    for (Attributes.Type tipo : Attributes.Type.values()) {
                        System.out.print(tipo + ": ");
                        int score = leerEntero(sc);
                        nuevoPJ.getAtributos().setScore(tipo, score);
                    }

                    manager.guardar(nuevoPJ);
                    break;

                case 2:
                    // --- BLOQUE DE BÚSQUEDA ---
                    System.out.print("\nIntroduce el nombre a buscar: ");
                    String busca = sc.nextLine();
                    PJ encontrado = manager.buscar(busca);

                    if (encontrado != null) {
                        mostrarFicha(encontrado);
                    } else {
                        System.out.println("Error: Personaje no encontrado.");
                    }
                    break;

                case 3:
                    manager.listarNombres();
                    break;

                case 4:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        System.out.println("Cerrando el gestor...");
    }


    private static void mostrarFicha(PJ p) {
        System.out.println("\n==============================");
        System.out.println("FICHA: " + p.getNombre().toUpperCase());
        System.out.println("Nivel: " + p.getNivel() + " | Bono Comp: +" + p.getBonoComp());
        System.out.println("------------------------------");
        for (Attributes.Type t : Attributes.Type.values()) {
            int score = p.getAtributos().getScore(t);
            int mod = p.getAtributos().getModifier(t);
            System.out.printf("%-4s: %2d (Mod: %s%d)%n", t, score, (mod >= 0 ? "+" : ""), mod);
        }
        System.out.println("==============================");
    }


    private static int leerEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Introduce un número válido: ");
            sc.next();
        }
        int n = sc.nextInt();
        sc.nextLine(); // Limpiar el salto de línea
        return n;
    }
}