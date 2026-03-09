package implementacion;

import logica.PJ;
import java.util.HashMap;
import java.util.Map;

public class CharacterManager {
    // La clave (Key) será el nombre del PJ en minúsculas para evitar fallos
    private final Map<String, PJ> Biblioteca;

    public CharacterManager() {
        this.Biblioteca = new HashMap<>();
    }

    public void guardar(PJ p) {
        Biblioteca.put(p.getNombre().toLowerCase(), p);
        System.out.println("¡Personaje [" + p.getNombre() + "] guardado con éxito!");
    }

    public PJ buscar(String nombre) {
        return Biblioteca.get(nombre.toLowerCase());
    }

    public void listarNombres() {
        if (Biblioteca.isEmpty()) {
            System.out.println("No hay personajes en el sistema.");
        } else {
            System.out.println("Personajes registrados: " + Biblioteca.keySet());
        }
    }
}