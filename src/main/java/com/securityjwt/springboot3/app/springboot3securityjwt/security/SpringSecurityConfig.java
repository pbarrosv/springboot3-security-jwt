package com.securityjwt.springboot3.app.springboot3securityjwt.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {

	/*Se encarga de encriptar nuestro password*/	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return http.authorizeHttpRequests( authz -> authz
				.requestMatchers(HttpMethod.GET,"/api/users").permitAll()/*Permite el acceso solo a /users*/
				.requestMatchers(HttpMethod.POST,"/api/users/register").permitAll()
				.anyRequest().authenticated())/*para todo lo demas necesita autentificacion*/
				.csrf(config -> config.disable()) /*Solo es para vistas como thymeaf jsp*/
				.sessionManagement(management -> management.sessionCreationPolicy(SessionCreationPolicy.STATELESS))/*para que la sesion http no tenga estado y todo que es autentificacion se maneje en el Token*/
				.build();
	}
	
}
