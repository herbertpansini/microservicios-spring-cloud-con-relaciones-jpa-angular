package com.formacionbdi.microservicios.commons.alumnos.models.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "alumnos")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String nombre;
	String apellido;
	@Column(unique = true)
	String email;
	@Column(name = "create_at")
	Date createAt;
}