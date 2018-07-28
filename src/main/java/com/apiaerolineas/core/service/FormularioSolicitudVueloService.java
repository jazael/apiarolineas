package com.apiaerolineas.core.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.apiaerolineas.core.converter.Converter;
import com.apiaerolineas.core.entity.FormularioSolicitudVuelo;
import com.apiaerolineas.core.model.FormularioSolicitudVueloModel;
import com.apiaerolineas.core.repository.FormularioSolicitudVueloRepository;

@Service("servicio")
public class FormularioSolicitudVueloService {
	
	@Autowired
	@Qualifier("repositorio")
	private FormularioSolicitudVueloRepository formularioSolicitudVueloRepository;
	
	@Autowired
	@Qualifier("convertidor")
	private Converter converter;
	
	private static final Log logger = LogFactory.getLog(FormularioSolicitudVueloService.class);
	
	public boolean createRequestForm(FormularioSolicitudVuelo formularioSolicitudVuelo) {
		try {
			logger.info("Solicitud de vuelo creada");
			formularioSolicitudVueloRepository.save(formularioSolicitudVuelo);
			return true;
		} catch (Exception e) {
			logger.info(e.getMessage());
			return false;
		}
	}
	
	public boolean updateRequestForm(FormularioSolicitudVuelo formularioSolicitudVuelo) {
		try {
			logger.info("Solicitud de vuelo actualizada");
			formularioSolicitudVueloRepository.save(formularioSolicitudVuelo);
			return true;
		} catch (Exception e) {
			logger.info(e.getMessage());
			return false;
		}
	}
	
	public boolean deleteRequestForm(long id) {
		try {
			logger.warn("Solicitud de vuelo eliminada");
			FormularioSolicitudVuelo  formularioSolicitudVuelo = formularioSolicitudVueloRepository.findById(id);
			formularioSolicitudVueloRepository.delete(formularioSolicitudVuelo);
			return true;
		} catch (Exception e) {
			logger.info(e.getMessage());
			return false;
		}
	}
	
	public List<FormularioSolicitudVueloModel> getFlightRequestForm() {
		return converter.ConverterList(formularioSolicitudVueloRepository.findAll());
	}
	
	public List<FormularioSolicitudVueloModel> getPaginateFlightRequestForm(Pageable pageable) {
		return converter.ConverterList(formularioSolicitudVueloRepository.findAll(pageable).getContent());
	}
}
