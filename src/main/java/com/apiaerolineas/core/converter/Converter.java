package com.apiaerolineas.core.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.apiaerolineas.core.entity.FormularioSolicitudVuelo;
import com.apiaerolineas.core.model.FormularioSolicitudVueloModel;

@Component("convertidor")
public class Converter {

	public List<FormularioSolicitudVueloModel> ConverterList(List<FormularioSolicitudVuelo> formulariosolicitudes) {
		List<FormularioSolicitudVueloModel> formularioSolicitudVueloModel = new ArrayList<>();
		formulariosolicitudes.forEach(item -> {
			formularioSolicitudVueloModel.add(new FormularioSolicitudVueloModel(item));
		});
		
		return formularioSolicitudVueloModel;
	}
	
}
