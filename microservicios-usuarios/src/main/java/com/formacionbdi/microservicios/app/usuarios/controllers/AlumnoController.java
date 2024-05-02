package com.formacionbdi.microservicios.app.usuarios.controllers;

import com.formacionbdi.microservicios.commons.alumnos.services.dto.AlumnoDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.microservicios.app.usuarios.services.AlumnoService;
import com.formacionbdi.microservicios.commons.controllers.CommonController;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController extends CommonController<AlumnoDto, AlumnoService> {

}