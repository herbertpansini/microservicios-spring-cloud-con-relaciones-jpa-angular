package com.formacionbdi.microservicios.app.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EntityScan({"com.formacionbdi.microservicios.commons.alumnos.models.entity", 
			 "com.formacionbdi.microservicios.commons.alumnos.services.dto"})
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviciosUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosUsuariosApplication.class, args);
	}
}