package com.apiaerolineas.core.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.apiaerolineas.core.entity.Vuelo;
import com.apiaerolineas.core.repository.VueloRepository;

public class VueloService {

	@Autowired
	@Qualifier("vuelo")
	private VueloRepository vueloRepository;
	
	private static final Log logger = LogFactory.getLog(VueloService.class);
		
	public boolean createFlight(Vuelo vuelo) {
		try {
			logger.info("Vuelo aprovado");
			vueloRepository.save(vuelo);
			return true;
		} catch (Exception e) {
			logger.info(e.getMessage());
			return false;
		}
	}
	
}
