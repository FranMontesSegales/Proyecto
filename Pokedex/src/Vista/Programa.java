package Vista;
import bbdd.conexion;
import beans.Pokemon;
import controlador.Central;
import Vista.Añadir;
import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.sql.ResultSet;
import bbdd.conexion;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import bbdd.conexion;

public class Programa {

	public JFrame frame;
	private JTable table;
	private JTextField txtA;
	

	
	
	public Programa() {
		initialize();
	}
	

	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 676, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setPreferredSize(new Dimension(1400, 1400));

// TABLA
        final DefaultTableModel dtm = new DefaultTableModel();
        table = new JTable(dtm);
        table.setRowSelectionAllowed(false);
        table.setBounds(222, 93, 251, 158);
        frame.getContentPane().add(table);
       

        dtm.addColumn("numero");
        dtm.addColumn("Nombre");
        dtm.addColumn("altura");
        dtm.addColumn("peso");
        dtm.addColumn("Habilidad");
		
		
        
        //Añadir
        JButton boton1 = new JButton("A\u00F1adir");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Añadir window = new Añadir();
				window.frame.setVisible(true);
				
			}

			

			
		});
		
		//JScrollBar scrollBar = new JScrollBar();
		//scrollBar.setBounds(475, 93, 17, 158);
		//frame.getContentPane().add(scrollBar);
		
		boton1.setBounds(197, 39, 75, 28);
		frame.getContentPane().add(boton1);
		
		JButton boton2 = new JButton("Editar");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Editar window = new Editar();
				window.frame.setVisible(true);
			}
		});
		boton2.setBounds(309, 39, 75, 28);
		frame.getContentPane().add(boton2);
		
		JButton boton3 = new JButton("Borrar");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Borrar window = new Borrar();
				window.frame.setVisible(true);
			}
		});
		boton3.setBounds(423, 39, 75, 28);
		frame.getContentPane().add(boton3);
		
		
		//Refrescar Tabla
		JButton A = new JButton("A");
		A.setFont(new Font("Tahoma", Font.PLAIN, 11));
		A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<Pokemon> pokemons = new Central().refrescartodosPokemons();
                dtm.getDataVector().removeAllElements();
                dtm.fireTableDataChanged();

                // Montar los datos recogidos en la tabla
                for(Pokemon pokemon : pokemons){
                    Object[] fila = new Object[6];
                    fila[0] = pokemon.getNumero();
                    fila[1] = pokemon.getNombre();
                    fila[2] = pokemon.getAltura();
                    fila[3] = pokemon.getPeso();
                    fila[4] = pokemon.getHabilidad();
                   

                    dtm.addRow(fila);
                }	
			}
		});
		A.setBounds(561, 133, 49, 49);
		frame.getContentPane().add(A);
		
		
		
		
		
		
		
		
		
		JButton botonB = new JButton("B");
		botonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		txtA = new JTextField();
		txtA.setText("A");
		txtA.setBounds(561, 145, 39, 20);
		frame.getContentPane().add(txtA);
		txtA.setColumns(10);
		botonB.setBounds(502, 153, 49, 49);
		frame.getContentPane().add(botonB);
		
		JLabel labelPokemon = new JLabel("");
		labelPokemon.setBounds(49, 124, 92, 105);
		frame.getContentPane().add(labelPokemon);
		
		JLabel Fondo = new JLabel("");
		Fondo.setLabelFor(frame.getContentPane());
		Fondo.setIcon(new ImageIcon(Programa.class.getResource("/Imagenes/Pokedex.png")));
		Fondo.setBounds(0, 0, 660, 373);
		frame.getContentPane().add(Fondo);
	}


	
}
