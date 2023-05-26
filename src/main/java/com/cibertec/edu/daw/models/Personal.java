package com.cibertec.edu.daw.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Personal")

public class Personal implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_Tra")
	Long id;
	
	@Column(name = "nombre_Tra")
	String nombre;
	
	@Column(name = "sueldo_Tra")
	String sueldo;
	
	@Column(name = "cod_Area")
	Long codigoA;
	
	/*
	@OneToMany
	@JoinColumn(name = "cod_Area")
	private Area areas;*/
	
	

}
