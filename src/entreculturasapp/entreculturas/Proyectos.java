/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entreculturasapp.entreculturas;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author xavi
 * @param <T>
 */
public class Proyectos<T> {
	
	private String pais;
	private String localizacion;
	private Date fechaInicio;
	private Date fechaFin;
	private String socioLocal;
	private String Financiador;
	private int ID;
	private String acciones;
	private ArrayList<T> personalContratado;
	private ArrayList<T> personalVoluntario;
	
	
	
	public Proyectos(String pais, String localizacion, Date fechaInicio, Date fechaFin, String socioLocal,
			String financiador, int ID, String acciones, ArrayList<T> personalContratado,
			ArrayList<T> personalVoluntario) {
		super();
		this.pais = pais;
		this.localizacion = localizacion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.socioLocal = socioLocal;
		Financiador = financiador;
		this.ID = ID;
		this.acciones = acciones;
		this.personalContratado = personalContratado;
		this.personalVoluntario = personalVoluntario;
	}
	
	
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getSocioLocal() {
		return socioLocal;
	}
	public void setSocioLocal(String socioLocal) {
		this.socioLocal = socioLocal;
	}
	public String getFinanciador() {
		return Financiador;
	}
	public void setFinanciador(String financiador) {
		Financiador = financiador;
	}
	public String getAcciones() {
		return acciones;
	}
	public void setAcciones(String acciones) {
		this.acciones = acciones;
	}
	public ArrayList<T> getPersonalContratado() {
		return personalContratado;
	}
	public void setPersonalContratado(ArrayList<T> personalContratado) {
		this.personalContratado = personalContratado;
	}
	public ArrayList<T> getPersonalVoluntario() {
		return personalVoluntario;
	}
	public void setPersonalVoluntario(ArrayList<T> personalVoluntario) {
		this.personalVoluntario = personalVoluntario;
	}



    public int getID() {
        return 0;
    }

	public void setID() {
		this.ID = ID;
	}


}
