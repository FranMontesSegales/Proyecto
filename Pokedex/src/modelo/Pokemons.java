package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;
import beans.Pokemon;

public class Pokemons {
	// VISUALIZAR POKEMON

    public ArrayList<Pokemon> refrescarPokemons(){
        // TODO: Hacer peticion a BBDD para recoger los pokemon

        ArrayList<Pokemon> Pokemons = new ArrayList<Pokemon>();
        ResultSet resultado = conexion.EjecutarSentencia("SELECT * FROM pokemon;");

        try {
            while(resultado.next()) {
                int numero = resultado.getInt("numero");
                String nombre = resultado.getString("Nombre");
                double altura = resultado.getDouble("Altura");
                double peso = resultado.getDouble("Peso");
                String habilidad = resultado.getString("Habilidad");
                Pokemons.add(new Pokemon(numero, nombre, altura, peso, habilidad));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Pokemons;
    }

    
    
    
    //Añadir
	public void crearPokemons(Pokemon pokemon) {
		int numero =  pokemon.getNumero();
        String nombre = pokemon.getNombre();
        double altura = pokemon.getAltura();
        double peso = pokemon.getPeso();
        String habilidad = pokemon.getHabilidad();
        conexion.ejecutarUpdate(
				"INSERT INTO pokemon (Numero, Nombre, Altura, Peso, Habilidad)"+
				" VALUES ('"+numero+"', '"+nombre+"','"+altura+"', '"+peso+"', '"+habilidad+"');"
				);
    }
		 //int numero = pokemon.getNumero();
         //String nombre = pokemon.getNombre();
         //double altura = pokemon.getAltura();
         //double peso = pokemon.getPeso();
         //String habilidad = pokemon.getHabilidad();
		
		
	
	//Borrar	
	public void borrarPokemons(String nombre) {
        conexion.ejecutarUpdate("DELETE FROM pokemon WHERE NOMBRE='"+nombre+"';");
    }
	
	
	public void modificarPokemons(Pokemon pokemon) {
			
			int numero =  pokemon.getNumero();
	        String nombre = pokemon.getNombre();
	        double altura = pokemon.getAltura();
	        double peso = pokemon.getPeso();
	        String habilidad = pokemon.getHabilidad();
		        conexion.ejecutarUpdate("INSERT INTO pokemon (numero, nombre, altura, peso, habilidad) VALUES ('"+numero+"', '"+nombre+"','"+altura+"','"+peso+"','"+habilidad+"');");
	
    }
	
	//Editar
	
	
}
