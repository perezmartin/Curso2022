package es.rf.tienda.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import es.rf.tienda.dominio.Categoria;

public class VistaCategoria extends JFrame {

	private static final long serialVersionUID = 1L;
	private Categoria categoria;

	public void iniciarVista() {
		// estos componentes irian en el constructor pero si los pongo ahi no se
		// muestran los corazones
		initComponents(); // inicio los componentes
		setLocationRelativeTo(null); // centro la VistaSwing a la pantalla
		setVisible(true); // hago visible la VistaSwing
	}

	private void initComponents() {

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setResizable(false);
		setSize(400, 300);

		if (categoria != null) {

			this.setTitle("Editar Categoria");

			this.botonAceptar.setText("Editar");

			this.botonEliminar.setText("Eliminar");
			this.botonEliminar.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
			this.botonEliminar.setForeground(Color.WHITE);
			this.botonEliminar.setBackground(Color.RED);

			this.input_cat_id.setText(categoria.getId_categoria() + "");
			this.input_cat_nombre.setText(categoria.getCat_nombre());
			this.textoDescripcion.setText(categoria.getCat_descripcion());

			this.panelBotones.add(botonAceptar);
			this.panelBotones.add(botonEliminar);

		} else {

			this.setTitle("Agregar Categoria");
			this.botonAceptar.setText("Agregar");

			this.panelBotones.add(botonAceptar);

		}

		this.cat_id.setText("ID");
		this.cat_nombre.setText("NOMBRE");
		this.cat_descripcion.setText("DESCRIPCION");

		this.botonAceptar.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
		this.botonAceptar.setBackground(Color.GREEN);

		this.textoDescripcion.setRows(4);
		JScrollPane input_cat_descripcion = new JScrollPane(textoDescripcion);

		this.panelElementos.setLayout(gridElementos);

		this.panelElementos.add(cat_id);
		this.panelElementos.add(input_cat_id);
		this.panelElementos.add(cat_nombre);
		this.panelElementos.add(input_cat_nombre);
		this.panelElementos.add(cat_descripcion);
		this.panelElementos.add(input_cat_descripcion);

		this.add(panelElementos, BorderLayout.CENTER);
		this.add(new JPanel(), BorderLayout.WEST);
		this.add(new JPanel(), BorderLayout.EAST);
		this.add(panelBotones, BorderLayout.SOUTH);

	}

	public void setCategoria(Categoria c) {
		this.categoria = c;
	}

	public void setCategoria(int id, String nombre, String des) {
		this.categoria = new Categoria(id, nombre, des);
	}

	public void clickEnBotonAceptar(ActionListener al) {
		this.botonAceptar.addActionListener(al);
	}

	public void clickEnBotonEliminar(ActionListener al) {
		this.botonAceptar.addActionListener(al);
	}

	// declaracion de variables

	JButton botonAceptar = new JButton();
	JButton botonEliminar = new JButton();

	JLabel cat_id = new JLabel();
	JLabel cat_nombre = new JLabel();
	JLabel cat_descripcion = new JLabel();
	JTextField input_cat_id = new JTextField();
	JTextField input_cat_nombre = new JTextField();
	JTextArea textoDescripcion = new JTextArea();

	JPanel panelBotones = new JPanel();
	JPanel panelElementos = new JPanel();

	GridLayout gridElementos = new GridLayout(6, 1);
}
