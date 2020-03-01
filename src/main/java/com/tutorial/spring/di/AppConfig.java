package com.tutorial.spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutorial.spring.di.services.IMiServicio;
import com.tutorial.spring.di.services.MiServicio;
import com.tutorial.spring.di.services.MiServicioComplejo;

@Configuration
public class AppConfig {
	
	//los métodos crean los componentes y retorna la instancia.
	//el @Bean sirve para incorporar un nuevo componente en el contenedor de spring.
	@Bean("Mi servicio simple")
	public IMiServicio registrarMiServicio() {		
		return new MiServicio();
	}
	
	
	@Bean("Mi servicio complejo")
	public IMiServicio registrarMiServicioComplejo() {		
		return new MiServicioComplejo();
	}

}
