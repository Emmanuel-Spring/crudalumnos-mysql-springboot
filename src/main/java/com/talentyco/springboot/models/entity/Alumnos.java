package com.talentyco.springboot.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Alumnos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String apellido;

    private Date fechaNacimineto;

    private String direccion;

    private String colegio;

    private String curso;

    private String apoderado;
}
