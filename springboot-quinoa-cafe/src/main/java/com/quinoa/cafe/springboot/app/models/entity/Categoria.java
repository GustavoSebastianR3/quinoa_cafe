package com.quinoa.cafe.springboot.app.models.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "categorias")
public class Categoria implements Serializable {
    @Id
    @Column(name = "id_categoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;
    private String nombre;
    private String icono;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    @JoinColumn(name = "id_categoria")
    private List<Producto> productos;

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

	public Categoria(Long idCategoria, String nombre, String icono, List<Producto> productos) {
		super();
		this.idCategoria = idCategoria;
		this.nombre = nombre;
		this.icono = icono;
		this.productos = productos;
	}

	public Categoria() {
		super();
	}
	
}
