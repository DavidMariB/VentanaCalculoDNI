package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.CalcularLetra;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/*
 * By Paco Gomez
 * Esta ventana tendrá dos JTextFields
 * El primero recojerá el DNI
 * El segundo calculará la letra al apretar el botón
 * 
 * */
public class VentanaLetraDNI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private CalcularLetra calc;


	/**
	 * Create the frame.
	 */
	public VentanaLetraDNI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JLabel lblIntroduceDni = new JLabel("INTRODUCE DNI (SIN LETRA)");
		lblIntroduceDni.setAlignmentX(0.5f);
		lblIntroduceDni.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblIntroduceDni);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblLetraDniCalculada = new JLabel("Letra DNI Calculada");
		lblLetraDniCalculada.setAlignmentX(0.5f);
		contentPane.add(lblLetraDniCalculada);
		
		textField_1 = new JTextField();
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setEditable(false);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc = new CalcularLetra(textField.getText());
				if(calc.error == false){
					textField_1.setText(String.valueOf(calc.devolverLetra()));
				}else{
					textField_1.setText(String.valueOf(calc.devolverError()));
				}
				
			}
		});
		btnCalcular.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(btnCalcular);
	}

}
