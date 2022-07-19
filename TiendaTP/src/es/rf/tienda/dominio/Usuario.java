package es.rf.tienda.dominio;

import java.util.Date;

public class Usuario {

	private int id_usuario;
	private String user_nombre;
	private String user_email;
	private String user_pass;
	private int id_tipo;
	private int user_dni;
	private Date user_fecAlta;

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getUser_nombre() {
		return user_nombre;
	}

	public void setUser_nombre(String user_nombre) {
		this.user_nombre = user_nombre;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	public int getId_tipo() {
		return id_tipo;
	}

	public void setId_tipo(int id_tipo) {
		this.id_tipo = id_tipo;
	}

	public int getUser_dni() {
		return user_dni;
	}

	public void setUser_dni(int user_dni) {
		this.user_dni = user_dni;
	}

	public Date getUser_fecAlta() {
		return user_fecAlta;
	}

	public void setUser_fecAlta(Date user_fecAlta) {
		this.user_fecAlta = user_fecAlta;
	}

	public Date getUser_fecConfirmacion() {
		return user_fecConfirmacion;
	}

	public void setUser_fecConfirmacion(Date user_fecConfirmacion) {
		this.user_fecConfirmacion = user_fecConfirmacion;
	}

	public Direccion getUser_pago() {
		return user_pago;
	}

	public void setUser_pago(Direccion user_pago) {
		this.user_pago = user_pago;
	}

	public Direccion getUser_envio() {
		return user_envio;
	}

	public void setUser_envio(Direccion user_envio) {
		this.user_envio = user_envio;
	}

	private Date user_fecConfirmacion;
	private Direccion user_pago;
	private Direccion user_envio;

}
