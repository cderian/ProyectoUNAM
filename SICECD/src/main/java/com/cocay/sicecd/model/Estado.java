package com.cocay.sicecd.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "Estado")
public class Estado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk_id_estado")
	int pk_id_estado;
	@Column(name = "nombre")
	String nombre;

	@OneToMany(mappedBy = "fk_id_estado", targetEntity=Profesor.class)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Profesor> profesores = new ArrayList<>();

	public int getPk_id_estado() {
		return pk_id_estado;
	}

	public void setPk_id_estado(int pk_id_estado) {
		this.pk_id_estado = pk_id_estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(List<Profesor> profesores) {
		this.profesores = profesores;
	}
	
	
}
