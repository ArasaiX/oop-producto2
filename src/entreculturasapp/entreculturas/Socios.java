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
public class Socios {
    
    private int ID;
	private String Nombre;
	private String IBAN;
	private float cuota;
	private int periocidad;
	
	
	public Socios(int iD, String nombre, String iBAN, float cuota, int periocidad) {
		super();
		ID = iD;
		Nombre = nombre;
		IBAN = iBAN;
		this.cuota = cuota;
		this.periocidad = periocidad;
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
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}
	public float getCuota() {
		return cuota;
	}
	public void setCuota(float cuota) {
		this.cuota = cuota;
	}
	public int getPeriocidad() {
		return periocidad;
	}
	public void setPeriocidad(int periocidad) {
		this.periocidad = periocidad;
	}
	
	
        
}
