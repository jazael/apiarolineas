package com.apiaerolineas.core.model;

import java.sql.Timestamp;

import com.apiaerolineas.core.entity.FormularioSolicitudVuelo;

public class FormularioSolicitudVueloModel {
	
	public FormularioSolicitudVueloModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FormularioSolicitudVueloModel(FormularioSolicitudVuelo formularioSolicitudVuelo) {
		this.id = formularioSolicitudVuelo.getId();
		this.nombresolicitante = formularioSolicitudVuelo.getNombresolicitante();
		this.correoelectronico = formularioSolicitudVuelo.getCorreoelectronico();
		this.fechaviaje = formularioSolicitudVuelo.getFechaviaje();
		this.origen = formularioSolicitudVuelo.getOrigen();
		this.destino = formularioSolicitudVuelo.getDestino();
		this.state = formularioSolicitudVuelo.getState();
		this.fechacreacion = formularioSolicitudVuelo.getFechacreacion();
		this.fechaactualizacion = formularioSolicitudVuelo.getFechaactualizacion();
	}
	
	public FormularioSolicitudVueloModel(long id, String nombresolicitante, String correoelectronico, Timestamp fechaviaje, String origen, String destino,
			String state, Timestamp fechacreacion, Timestamp fechaactualizacion) {
		this.id = id;
		this.nombresolicitante = nombresolicitante;
		this.correoelectronico = correoelectronico;
		this.fechaviaje = fechaviaje;
		this.origen = origen;
		this.destino = destino;
		this.state = state;
		this.fechacreacion = fechacreacion;
		this.fechaactualizacion = fechaactualizacion;
	}

	private long id;
	
	private String nombresolicitante;
	
	private String correoelectronico;
	
	private Timestamp fechaviaje;
	
	private String origen;
	
	private String destino;
	
	private String state;
	
	private Timestamp fechacreacion;
	
	private Timestamp fechaactualizacion;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombresolicitante() {
		return nombresolicitante;
	}

	public void setNombresolicitante(String nombresolicitante) {
		this.nombresolicitante = nombresolicitante;
	}

	public Timestamp getFechaviaje() {
		return fechaviaje;
	}

	public void setFechaviaje(Timestamp fechaviaje) {
		this.fechaviaje = fechaviaje;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
}
