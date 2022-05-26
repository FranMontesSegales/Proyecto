package main;


import Vista.Programa;
import bbdd.conexion;

public class Main {
	public static void main(String[] args) {
		conexion.Conectar();						//por alguna razon el main no me funciona bien y se bugea
		Programa window = new Programa();
		window.frame.setVisible(true);
		

	}

}
