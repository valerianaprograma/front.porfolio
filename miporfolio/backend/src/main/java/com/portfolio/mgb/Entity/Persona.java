package com.portfolio.mgb.Entity;

import jakarta.persistence.Entity;

@Entity

public class Persona {
    @Id
    @GeneretedValue(strategy=)
    
    private Long id;
    private String nombre;
    private String apellido;
    private String img;
    
}
