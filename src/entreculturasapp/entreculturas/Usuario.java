/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entreculturasapp.entreculturas;

/**
 *
 * @author xavi
 */
public class Usuario {
    private int ID;
	private String Nombre;
	private String password;
	private String Usuario;
	private String tipo;
	private String delegacion;
	
	
	public Usuario(int iD, String nombre, String password, String usuario, String tipo, String delegacion) {
		super();
		ID = iD;
		Nombre = nombre;
		this.password = password;
		Usuario = usuario;
		this.tipo = tipo;
		this.delegacion = delegacion;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDelegacion() {
		return delegacion;
	}
	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}
}
