package com.apiaerolineas.core.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="vuelo")
public class Vuelo implements Serializable {

	private static final long serialVersionUID = -4718488054429545462L;

	@GeneratedValue
	@Id
	@Column(name="id")
	private long id;
	
	@ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn(name="solicitud_id")
    private FormularioSolicitudVuelo formularioSolicitudVuelo;
	
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
