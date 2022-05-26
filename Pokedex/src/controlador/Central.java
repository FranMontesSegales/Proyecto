package controlador;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.Pokemon;
import modelo.Pokemons;


public class Central {

	
	//Refrescar Tabla
	public ArrayList<Pokemon> refrescartodosPokemons() {
        ArrayList<Pokemon> pokemons = new Pokemons().refrescarPokemons();
        return pokemons;
    }
	
	
	
	
	//Añadir Pokemon
	public void crearPokemons(Pokemon pokemon) {
		new Pokemons().crearPokemons(pokemon);
		JOptionPane.showMessageDialog(null, "El Pokemon " + pokemon.getNombre()+" se ha registrado correctamente");
	}

	
	//Eliminar Pokemon
	public void borrarPokemons(String nombre) {
        new Pokemons().borrarPokemons(nombre);
        JOptionPane.showMessageDialog(null, "¡Has borrado correctamente el Pokemon!");
    }
	
	
	
	//Editar Pokemon
	public void modificarPokemons(Pokemon pokemon) {
        new Pokemons().modificarPokemons(pokemon);
        JOptionPane.showMessageDialog(null, "¡Has modificado el Pokemon!");

    }
	

}
