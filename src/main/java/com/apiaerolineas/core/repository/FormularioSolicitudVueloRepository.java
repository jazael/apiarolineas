package com.apiaerolineas.core.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.apiaerolineas.core.entity.FormularioSolicitudVuelo;

@Repository("repositorio")
public interface FormularioSolicitudVueloRepository extends JpaRepository<FormularioSolicitudVuelo, Serializable>, PagingAndSortingRepository<FormularioSolicitudVuelo, Serializable> {
	
	public abstract List<FormularioSolicitudVuelo> findByNombresolicitante(String nombresolicitante);
	
	public abstract FormularioSolicitudVuelo findByNombresolicitanteAndId(String nombresolicitante, long id);
	
	public abstract FormularioSolicitudVuelo findById(long id);
	
	public abstract Page<FormularioSolicitudVuelo> findAll(Pageable pageable);
	
}
