package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import beans.Pokemon;
import controlador.Central;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Borrar {

	public JFrame frame;
	private JTextField textNombre;
	private JTextField textHabilidad;

	
	/**
	 * Create the application.
	 */
	public Borrar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 730, 624);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel LNombre = new JLabel("Nombre:");
		LNombre.setBounds(243, 172, 72, 26);
		frame.getContentPane().add(LNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(357, 171, 98, 29);
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		JButton ButtonVolver = new JButton("Volver");
		ButtonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				
				
				
				
				
			}
		});
		
		ButtonVolver.setBounds(137, 307, 89, 23);
		frame.getContentPane().add(ButtonVolver);
		
		
		//Borrar
		JButton ButtonCrear = new JButton("Borrar");
		ButtonCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				 try {
	                    String nombre = (textNombre.getText());
	                    new Central().borrarPokemons(nombre);
	                    

	                } catch(Exception error) {
	                    JOptionPane.showMessageDialog(null, "Introduce los datos correctamente");
	                    return;
	                }
	            }
		});
		ButtonCrear.setBounds(450, 307, 89, 23);
		frame.getContentPane().add(ButtonCrear);
		
		JLabel fondo = new JLabel("fondo");
		fondo.setIcon(new ImageIcon(Añadir.class.getResource("/Imagenes/pokedexEditable.jpg")));
		fondo.setBounds(-17, 0, 731, 586);
		frame.getContentPane().add(fondo);
		
		
		
		
		
	}
}

