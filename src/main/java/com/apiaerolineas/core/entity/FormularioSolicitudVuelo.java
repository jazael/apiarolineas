package com.apiaerolineas.core.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Table(name="formulariosolicitudvuelo")
@Entity
public class FormularioSolicitudVuelo implements Serializable {

	private static final long serialVersionUID = 8621611032317802490L;

	public FormularioSolicitudVuelo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FormularioSolicitudVuelo(long id, String nombresolicitante, String correoelectronico, Timestamp fechaviaje, String origen, String destino,
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

	@GeneratedValue
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="nombresolicitante")
	private String nombresolicitante;
	
	@Column(name="correoelectronico")
	private String correoelectronico;
	
	@Column(name="fechaviaje")
	private Timestamp fechaviaje;
	
	@Column(name="origen")
	private String origen;
	
	@Column(name="destino")
	private String destino;
	
	@Column(name="state")
	private String state;
	
	@Column(name="fechacreacion")
	@CreationTimestamp
	private Timestamp fechacreacion;
	
	@Column(name="fechaactualizacion")
	@UpdateTimestamp
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
	
	@PrePersist
	void preInsert() {
	   if (this.state == null)
	       this.state = "NUEVO";
	}
	
}
