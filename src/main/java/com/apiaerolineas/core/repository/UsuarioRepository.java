package com.apiaerolineas.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apiaerolineas.core.entity.Usuario;

@Repository("gestorusuario")
public interface UsuarioRepository extends JpaRepository<Usuario, Serializable> {

	public abstract Usuario findByUsuario(String usuario);
	
}
