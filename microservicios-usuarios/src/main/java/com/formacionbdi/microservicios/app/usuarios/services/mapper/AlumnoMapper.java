package com.formacionbdi.microservicios.app.usuarios.services.mapper;

import com.formacionbdi.microservicios.commons.alumnos.models.entity.Alumno;
import com.formacionbdi.microservicios.commons.alumnos.services.dto.AlumnoDto;
import com.formacionbdi.microservicios.commons.services.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AlumnoMapper extends EntityMapper<Alumno, AlumnoDto> {

}
