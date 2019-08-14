package com.inventario.app.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "categorias")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "detalle")
	private String detalle;

	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	// Constructores
	public Categoria(Long id, String nombre, String detalle, Date createAt) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.detalle = detalle;
		this.createAt = createAt;
	}

	public Categoria() {
		super();
	}

	// Geter and Setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

}
