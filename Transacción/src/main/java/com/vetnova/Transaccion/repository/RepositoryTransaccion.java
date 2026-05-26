package com.vetnova.Transaccion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vetnova.Transaccion.model.Transaccion;

public interface RepositoryTransaccion extends JpaRepository<Transaccion, Long> {
    
}
