package com.talentyco.springboot.models.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Apoderado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre_apoderado")
    private String nombre;

    @Column(name = "apellido_poderado")
    private String apellido;

    @Column(name = "direccion_poderado")
    private String direccion;

}
