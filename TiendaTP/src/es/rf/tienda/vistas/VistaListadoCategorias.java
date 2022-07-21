package es.rf.tienda.vistas;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import es.rf.tienda.dominio.Categoria;

public class VistaListadoCategorias extends JFrame {
	private static final long serialVersionUID = 1L;

	VistaListadoCategorias() {
		super.setTitle("Listado Categorias");
	}

	public void iniciarVista() {

		initComponents(); // inicio los componentes
		setLocationRelativeTo(null); // centro la VistaSwing a la pantalla
		setVisible(true); // hago visible la VistaSwing
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
		this.setSize(400, 300);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		panelTop.add(label);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelTop.setLayout(new BoxLayout(panelTop, BoxLayout.Y_AXIS));

		panelCentro.add(listaCategorias);

		panelBot.add(botonAgregar);
		panelBot.add(botonEliminarSeleccionados);

		this.add(panelTop, BorderLayout.NORTH);
		this.add(scrollPanel, BorderLayout.CENTER);
		this.add(panelBot, BorderLayout.SOUTH);

		this.setVisible(true);

	}

	public void clickEnBotonAceptar(ActionListener al) {
		this.botonAgregar.addActionListener(al);
	}

	public void clickEnEliminar(ActionListener al) {
		this.botonEliminarSeleccionados.addActionListener(al);
	}

	public void clickEnListadoCategorias(MouseListener al) {
		this.listaCategorias.addMouseListener(al);
	}

	private JPanel panelTop = new JPanel();
	private JPanel panelBot = new JPanel();
	private JPanel panelCentro = new JPanel();

	private JScrollPane scrollPanel = new JScrollPane(panelCentro);

	private JButton botonAgregar = new JButton("Agregar Nueva Categoria");
	private JButton botonEliminarSeleccionados = new JButton("Eliminar Seleccionados");

	private JLabel label = new JLabel("ID + NOMBRE");

	private JList<Categoria> listaCategorias = new JList<Categoria>();

}