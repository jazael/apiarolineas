package com.apiaerolineas.core.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.apiaerolineas.core.entity.Usuario;
import com.apiaerolineas.core.repository.UsuarioRepository;

@Service("usuarioservice")
public class UsuarioService implements UserDetailsService{

	@Autowired
	@Qualifier("gestorusuario")
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByUsuario(username);
		return new User(
				usuario.getUsuario(),
				usuario.getContrasena(),
				usuario.isActivo(), 
				usuario.isActivo(),
				usuario.isActivo(),
				usuario.isActivo(),
				buildGranted(usuario.getRol()));
	}
	
	public List<GrantedAuthority> buildGranted(byte rol) {
		String[] roles = { "INVITADO", "SUPERVISOR", "ADMINISTRADOR" };
		List<GrantedAuthority> auths = new ArrayList<>();
		for (int i = 0; i < rol; i++) {
			auths.add(new SimpleGrantedAuthority(roles[i]));
		}
		
		return auths;
	}
	
}
