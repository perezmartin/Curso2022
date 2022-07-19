package es.rf.tienda.vistas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VistaCategoria {

	public static void main(String[] args) {
		JFrame app = new JFrame("VistaCategoria");
		app.setSize(1000, 300);
		app.setLocationRelativeTo(null);
		
		
		JButton botonEditar = new JButton("Editar");
		JButton botonCancelar = new JButton("Cancelar");
		
		
		JLabel cat_id = new JLabel("ID");
		JLabel cat_nombre = new JLabel("Nombre");
		JLabel cat_descripcion = new JLabel("Descripcin");
		JTextField input_cat_id = new JTextField("getCategoriaID");
		JTextField input_cat_nombre = new JTextField("getCategoriaNombre");
		JTextField input_cat_descripcion = new JTextField("getCategoriaDescripcion");

		
		JPanel panelBotones = new JPanel();
		JPanel panelElementos = new JPanel();
		
		
		
		panelElementos.add(cat_id);
		panelElementos.add(input_cat_id);
		panelElementos.add(cat_nombre);
		panelElementos.add(input_cat_nombre);
		panelElementos.add(cat_descripcion);
		panelElementos.add(input_cat_descripcion);

		panelBotones.add(botonEditar);
		panelBotones.add(botonCancelar);
		
		app.add(panelElementos,BorderLayout.CENTER);
		app.add(panelBotones,BorderLayout.SOUTH);
		
		app.setVisible(true);
	}

}
