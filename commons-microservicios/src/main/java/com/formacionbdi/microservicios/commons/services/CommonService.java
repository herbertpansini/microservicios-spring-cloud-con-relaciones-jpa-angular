package com.formacionbdi.microservicios.commons.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CommonService<D> {
	Page<D> findAll(Pageable pageable);
	D findById(long id);
	D save(D dto);
	D update(long id, D dto);
	void deleteById(long id);
}