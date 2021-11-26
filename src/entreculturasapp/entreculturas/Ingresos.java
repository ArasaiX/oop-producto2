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
public class Ingresos {
    
    private String Nombre;
	private String Tipo;
	private float Cantidad;
	private int ID;
	
	
	public Ingresos(String nombre, String tipo, float cantidad, int id) {
		super();
		Nombre = nombre;
		Tipo = tipo;
		Cantidad = cantidad;
		ID = id;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public float getCantidad() {
		return Cantidad;
	}
	public void setCantidad(float cantidad) {
		Cantidad = cantidad;
	}

    public int getID() {
        return ID;
    }
	public void setID(int id) {
		ID = id;
	}
        
}
