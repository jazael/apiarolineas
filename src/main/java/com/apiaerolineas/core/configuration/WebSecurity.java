package com.apiaerolineas.core.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.apiaerolineas.core.service.UsuarioService;

@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {
	
	@Autowired
	@Qualifier("usuarioservice")
	private UsuarioService usuarioService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(usuarioService);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
			.antMatchers("/login", "/v1/solicitud").permitAll() // Se permite acceso al login y a la ruta pública de crear solicitud
			.anyRequest().authenticated() // Cualquier otra petición requiere autenticación
			.and()
			// Las perticiones /login pasaran previamente por este filtro
			.addFilterBefore(new LoginFilter("/login", authenticationManager()), 
					UsernamePasswordAuthenticationFilter.class)
			// Las demas peticiones pasarán por este filtro para validar el token
			.addFilterBefore(new JwtFilter(), UsernamePasswordAuthenticationFilter.class);
	}
	
	
	
}
