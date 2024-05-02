package com.formacionbdi.microservicios.commons.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.formacionbdi.microservicios.commons.services.CommonService;

public class CommonController<D, S extends CommonService<D>> {

	@Autowired
	protected S service;
	
	@GetMapping
	public ResponseEntity<?> findAll(Pageable pageable) {
		return ResponseEntity.ok(this.service.findAll(pageable));
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> findById(@PathVariable long id) {
		return ResponseEntity.ok(this.service.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody D dto) {
		return ResponseEntity.ok(this.service.save(dto));
	}
	
	@PutMapping("{id}")
	public ResponseEntity<?> update(@PathVariable long id, @RequestBody D dto) {
		return ResponseEntity.ok(this.service.update(id, dto));
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteById(@PathVariable long id) {
		this.service.deleteById(id);
	}
}