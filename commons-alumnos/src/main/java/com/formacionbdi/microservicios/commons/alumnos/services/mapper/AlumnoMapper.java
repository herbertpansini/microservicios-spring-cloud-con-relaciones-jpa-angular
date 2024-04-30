package com.formacionbdi.microservicios.commons.alumnos.services.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.formacionbdi.microservicios.commons.alumnos.models.entity.Alumno;
import com.formacionbdi.microservicios.commons.alumnos.services.dto.AlumnoDto;

@Mapper(componentModel = "spring")
public interface AlumnoMapper {
	AlumnoMapper INSTANCE = Mappers.getMapper(AlumnoMapper.class);
	 
	AlumnoDto alumnoToAlumnoDto(Alumno alumno);
	Alumno alumnoDtoToAlumno(AlumnoDto alumnoDto);
}