package com.vetnova.Transaccion.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "transacciones")
@NoArgsConstructor
@AllArgsConstructor
public class Transaccion {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     @Column(nullable = false)
    private LocalDate fecha;
 
    @Column(nullable = false)
    private double total;
 
    @Column(nullable = false, length = 50)
    private String estado;

}
