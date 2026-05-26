package com.vetnova.Transaccion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vetnova.Transaccion.model.Transaccion;
import com.vetnova.Transaccion.repository.RepositoryTransaccion;

@Service
public class ServiceTransaccion {
    @Autowired
    private RepositoryTransaccion repositoryTransaccion;

    public ServiceTransaccion(RepositoryTransaccion repository) {
        this.repositoryTransaccion = repository;
    }

    public List<Transaccion> listar() {
        return repositoryTransaccion.findAll();
    }

    public Transaccion guardar(Transaccion transaccion) {
        return repositoryTransaccion.save(transaccion);
    }
}
