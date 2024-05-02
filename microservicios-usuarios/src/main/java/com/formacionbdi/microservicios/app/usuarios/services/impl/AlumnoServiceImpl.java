package com.formacionbdi.microservicios.app.usuarios.services.impl;

import com.formacionbdi.microservicios.app.usuarios.services.mapper.AlumnoMapper;
import com.formacionbdi.microservicios.commons.alumnos.services.dto.AlumnoDto;
import com.formacionbdi.microservicios.commons.services.impl.CommonServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.microservicios.app.usuarios.models.repository.AlumnoRepository;
import com.formacionbdi.microservicios.app.usuarios.services.AlumnoService;
import com.formacionbdi.microservicios.commons.alumnos.models.entity.Alumno;

@Service
@Transactional
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoDto, AlumnoRepository, AlumnoMapper> implements AlumnoService {

}