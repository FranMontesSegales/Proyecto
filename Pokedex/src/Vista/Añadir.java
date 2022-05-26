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
import modelo.Pokemons;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Añadir {

	public JFrame frame;
	private JTextField textNumero;
	private JTextField textNombre;
	private JTextField textAltura;
	private JTextField textPeso;
	private JTextField textHabilidad;
	private JTextField textField;

	
	/**
	 * Create the application.
	 */
	public Añadir() {
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
		
		JLabel LNumero = new JLabel("Numero:");
		LNumero.setBounds(137, 136, 66, 27);
		frame.getContentPane().add(LNumero);
		
		textNumero = new JTextField();
		textNumero.setBounds(194, 139, 86, 20);
		frame.getContentPane().add(textNumero);
		textNumero.setColumns(10);
		
		JLabel LNombre = new JLabel("Nombre:");
		LNombre.setBounds(137, 183, 55, 14);
		frame.getContentPane().add(LNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(194, 180, 86, 20);
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		JLabel LAltura = new JLabel("Altura:");
		LAltura.setBounds(348, 142, 46, 14);
		frame.getContentPane().add(LAltura);
		
		textAltura = new JTextField();
		textAltura.setBounds(411, 139, 86, 20);
		frame.getContentPane().add(textAltura);
		textAltura.setColumns(10);
		
		JLabel LPeso = new JLabel("Peso:");
		LPeso.setBounds(348, 183, 46, 14);
		frame.getContentPane().add(LPeso);
		
		textPeso = new JTextField();
		textPeso.setBounds(411, 180, 86, 20);
		frame.getContentPane().add(textPeso);
		textPeso.setColumns(10);
		
		JLabel LHabilidad = new JLabel("Habilidad:");
		LHabilidad.setBounds(225, 228, 55, 14);
		frame.getContentPane().add(LHabilidad);
		
		JButton ButtonVolver = new JButton("Volver");
		ButtonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				
				
				
				
				
			}
		});
		
		textField = new JTextField();
		textField.setBounds(290, 225, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		ButtonVolver.setBounds(137, 307, 89, 23);
		frame.getContentPane().add(ButtonVolver);
		
		JButton ButtonCrear = new JButton("Crear");
		ButtonCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int numero = Integer.parseInt(textNumero.getText());
					String nombre = textNombre.getText();
					double altura = Double.parseDouble(textAltura.getText());
					double peso = Double.parseDouble(textPeso.getText());
					String habilidad = textField.getText();
                    Pokemon pokemon = new Pokemon(numero, nombre, altura, peso, habilidad);
                    new Central().crearPokemons(pokemon);

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
