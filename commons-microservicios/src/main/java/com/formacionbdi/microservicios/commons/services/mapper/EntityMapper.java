package com.formacionbdi.microservicios.commons.services.mapper;

public interface EntityMapper<E, D> {
    E toEntity(D dto);
    D toDto(E entity);
}