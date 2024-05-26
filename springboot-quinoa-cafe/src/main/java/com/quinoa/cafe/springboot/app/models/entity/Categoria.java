package com.quinoa.cafe.springboot.app.models.entity;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "categorias")
public class Categoria implements Serializable {
    @Id
    @Column(name = "id_categoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;
    private String nombre;
    private String icono;

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

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}
    
}
