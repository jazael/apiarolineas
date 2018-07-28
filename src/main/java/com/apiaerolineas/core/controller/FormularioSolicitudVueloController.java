package com.apiaerolineas.core.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiaerolineas.core.entity.FormularioSolicitudVuelo;
import com.apiaerolineas.core.model.FormularioSolicitudVueloModel;
import com.apiaerolineas.core.service.FormularioSolicitudVueloService;

@RestController
@RequestMapping("/v1")
public class FormularioSolicitudVueloController {
	
	@Autowired
	@Qualifier("servicio")
	FormularioSolicitudVueloService formulariosolicitud;
	
	
	@PostMapping("/solicitud")
	public boolean addRequestForm(@RequestBody @Valid FormularioSolicitudVuelo formularioSolicitudVuelo) {
		return formulariosolicitud.createRequestForm(formularioSolicitudVuelo);
	}
	
	@PutMapping("/solicitud")
	public boolean updateRequestForm(@RequestBody @Valid FormularioSolicitudVuelo formularioSolicitudVuelo) {
		return formulariosolicitud.updateRequestForm(formularioSolicitudVuelo);
	}
	
	@DeleteMapping("/solicitud/{id}")
	public boolean deleteRequestForm(@PathVariable("id") long id) {
		return formulariosolicitud.deleteRequestForm(id);
	}
	
	@GetMapping("/solicitudes")
	public List<FormularioSolicitudVueloModel> getFlightRequestsForm() {
		return formulariosolicitud.getFlightRequestForm();
	}
	
	@GetMapping("/solicitudespaginador")
	public List<FormularioSolicitudVueloModel> getFlightRequestsFormPaginator(Pageable pageable) {
		return formulariosolicitud.getPaginateFlightRequestForm(pageable);
	}
	
}
