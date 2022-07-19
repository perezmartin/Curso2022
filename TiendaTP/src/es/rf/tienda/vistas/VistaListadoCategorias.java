package es.rf.tienda.vistas;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import es.rf.tienda.dominio.Categoria;

public class VistaListadoCategorias extends JFrame{
	private static final long serialVersionUID = 1L;

	VistaListadoCategorias(){
		
	}
	
	public void iniciarVista() {
		//estos componentes irian en el constructor pero si los pongo ahi no se muestran los corazones
		initComponents(); //inicio los componentes
		setLocationRelativeTo(null); //centro la VistaSwing a la pantalla
		setVisible(true); //hago visible la VistaSwing		
	}
	
	public void agregarListado(ArrayList<Categoria> c) {
	    DefaultListModel<Categoria> lista = new DefaultListModel<Categoria>();
	    this.listaCategorias.setModel(lista);

	    for (Categoria categoria : c) {
			lista.addElement(categoria);
		}
	}
	
	private void initComponents() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 300);
		this.setLocationRelativeTo(null);
				
		panelTop.add(texto);
		panelTop.add(botonAgregar);
		
		panelListado.add(listaCategorias);
		
		this.add(panelTop, BorderLayout.NORTH);
		this.add(scrollPanel, BorderLayout.CENTER);
				
		this.setVisible(true);
	
	}
	
	
	public void clickEnBotonAceptar(ActionListener al) {
		this.botonAgregar.addActionListener(al);
	}
	
	public void clickEnListadoCategorias(MouseListener al) {
		this.listaCategorias.addMouseListener(al);
	}
	
	JPanel panelTop = new JPanel();
	JPanel panelListado = new JPanel();
	
	JScrollPane scrollPanel = new JScrollPane(panelListado);
	
	JButton botonAgregar = new JButton("Agregar");
	JLabel texto = new JLabel("listado categorias");
	JList<Categoria> listaCategorias = new JList<Categoria>();
	
}
