package com.formacionbdi.microservicios.commons.services.impl;

import com.formacionbdi.microservicios.commons.services.mapper.EntityMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import com.formacionbdi.microservicios.commons.services.CommonService;

@Transactional
public class CommonServiceImpl<E, D, R extends JpaRepository<E, Long>, M extends EntityMapper<E, D>> implements CommonService<D> {

	@Autowired
	protected R repository;

	@Autowired
	protected M mapper;
	
	@Override
	@Transactional(readOnly = true)
	public Page<D> findAll(Pageable pageable) {
		return this.repository.findAll(pageable).map(this.mapper::toDto);
	}

	@Override
	@Transactional(readOnly = true)
	public D findById(long id) {
		return this.mapper.toDto(this.repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
	}

	@Override
	public D save(D dto) {
		return this.mapper.toDto(this.repository.save(this.mapper.toEntity(dto)));
	}

	@Override
	public D update(long id, D dto) {
		D db = this.findById(id);
		BeanUtils.copyProperties(dto, db, "id");
		return this.save(db);
	}

	@Override
	public void deleteById(long id) {
		this.repository.deleteById(id);	
	}
}