package com.apiaerolineas.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apiaerolineas.core.entity.Vuelo;

@Repository("vuelo")
public interface VueloRepository extends JpaRepository<Vuelo, Serializable> {
	
	public abstract Vuelo findById(long id);
	
}
