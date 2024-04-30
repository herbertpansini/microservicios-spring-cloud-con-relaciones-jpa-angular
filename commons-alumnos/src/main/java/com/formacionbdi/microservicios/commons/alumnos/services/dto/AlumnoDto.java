package com.formacionbdi.microservicios.commons.alumnos.services.dto;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AlumnoDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	Long id;
	String nombre;
	String apellido;
	String email;
	Boolean enable;
	Date createAt;
}