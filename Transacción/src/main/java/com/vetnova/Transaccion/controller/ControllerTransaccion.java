package com.vetnova.Transaccion.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vetnova.Transaccion.model.Transaccion;
import com.vetnova.Transaccion.service.ServiceTransaccion;

@RestController
@RequestMapping("/transacciones")
public class ControllerTransaccion {

    private final ServiceTransaccion service;

    public ControllerTransaccion(ServiceTransaccion service) {
        this.service = service;
    }

    @GetMapping
    public List<Transaccion> listar() {
        return service.listar();
    }

    @PostMapping
    public Transaccion guardar(@RequestBody Transaccion transaccion) {
        return service.guardar(transaccion);
    }

}
