package com.apiaerolineas.core.configuration;
import java.util.Collections;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {

	static void addAuthentication(HttpServletResponse res, String username) {
		String token = Jwts.builder()
				.setSubject(username)
				// Hash con el que se firma la clave
				.signWith(SignatureAlgorithm.HS512, "P@tit0")
				.compact();
		// Agregamos al encabezado el token
		res.addHeader("Authorization", "Bearer " + token);
		res.addCookie(new Cookie("Authorization", token));
	}
	
	static Authentication getAuthentication(HttpServletRequest request) {
		// Obtenemos el token que viene en el encabezado de la petición
		String token = request.getHeader("Authorization");
		// Si existe el token se valida
		if(token != null) {
			String user = Jwts.parser()
					.setSigningKey("P@tit0")
					.parseClaimsJws(token.replace("Bearer", "")) // Validamos
					.getBody()
					.getSubject();
			
			return user != null ? new UsernamePasswordAuthenticationToken(user, null, Collections.emptyList()) : null;
		}
		
		return null;
	}
	
}
