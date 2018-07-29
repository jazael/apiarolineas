package com.apiaerolineas.core.model;

import java.sql.Timestamp;

import com.apiaerolineas.core.entity.FormularioSolicitudVuelo;
import com.apiaerolineas.core.entity.Vuelo;

public class VueloModel {
	public VueloModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public VueloModel(Vuelo vuelo) {
		this.id = vuelo.getId();
		this.formularioSolicitudVuelo = vuelo.getFormularioSolicitudVuelo();
		this.fechacreacion = vuelo.getFechacreacion();
		this.fechaactualizacion = vuelo.getFechaactualizacion();
	}
	
	public VueloModel(long id, FormularioSolicitudVuelo formularioSolicitudVuelo, Timestamp fechacreacion,
			Timestamp fechaactualizacion) {
		this.id = id;
		this.formularioSolicitudVuelo = formularioSolicitudVuelo;
		this.fechacreacion = fechacreacion;
		this.fechaactualizacion = fechaactualizacion;
	}



	private long id;
	private FormularioSolicitudVuelo formularioSolicitudVuelo;
	private Timestamp fechacreacion;
	private Timestamp fechaactualizacion;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public FormularioSolicitudVuelo getFormularioSolicitudVuelo() {
		return formularioSolicitudVuelo;
	}
	public void setFormularioSolicitudVuelo(FormularioSolicitudVuelo formularioSolicitudVuelo) {
		this.formularioSolicitudVuelo = formularioSolicitudVuelo;
	}
	public Timestamp getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(Timestamp fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	public Timestamp getFechaactualizacion() {
		return fechaactualizacion;
	}
	public void setFechaactualizacion(Timestamp fechaactualizacion) {
		this.fechaactualizacion = fechaactualizacion;
	}

}
