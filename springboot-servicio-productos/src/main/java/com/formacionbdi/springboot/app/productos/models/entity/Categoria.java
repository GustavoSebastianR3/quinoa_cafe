package com.formacionbdi.springboot.app.productos.models.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {
    @Id
    @Column(name = "id_categoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;
    private String nombre;

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
